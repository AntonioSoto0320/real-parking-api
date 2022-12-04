package com.RealParking.persistence;

import com.RealParking.domain.dto.TicketDTO;
import com.RealParking.domain.repository.TicketRepository;
import com.RealParking.persistence.crud.TicketCrudRepository;
import com.RealParking.persistence.entity.Ticket;
import com.RealParking.persistence.mapper.TicketMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BoletoRepository implements TicketRepository {

    private TicketCrudRepository ticketCrudRepository;

    private TicketMapper ticketMapper;

    @Autowired
    public BoletoRepository(TicketCrudRepository ticketCrudRepository, TicketMapper ticketMapper) {
        this.ticketCrudRepository = ticketCrudRepository;
        this.ticketMapper = ticketMapper;
    }

    @Override
    public List<TicketDTO> getAll() {
        return ticketMapper.toTicketDTOs((List<Ticket>) ticketCrudRepository.findAll());
    }

    @Override
    public Optional<List<TicketDTO>> getByTicketId(int ticketId) {
        List<Ticket> tickets =ticketCrudRepository.findByIdTicket(ticketId);
        return Optional.of(ticketMapper.toTicketDTOs(tickets));
    }

    @Override
    public Optional<TicketDTO> getTicket(int ticketId) {
        return ticketCrudRepository.findById(ticketId)
                .map(ticket -> ticketMapper.toTicketDTO(ticket));
    }

    @Override
    public TicketDTO save(TicketDTO ticket) {
        Ticket tickete =ticketMapper.toTicket(ticket);

        return ticketMapper.toTicketDTO(ticketCrudRepository.save(tickete));
    }

    @Override
    public TicketDTO update(TicketDTO ticket) {
        return getTicket(ticket.getIdTicket())
                .map(ticketDTO -> {
                    ticketDTO.setPlaca(ticket.getPlaca());
                    ticketDTO.setEntryTime(ticket.getEntryTime());
                    ticketDTO.setDepartureTime(ticket.getDepartureTime());
                    ticketDTO.setStateTicket(ticket.getStateTicket());

                    Ticket tickete = ticketMapper.toTicket(ticketDTO);

                    return save(ticketMapper.toTicketDTO(tickete));
                }).orElse(null);
    }

    @Override
    public void delete(int ticketId) {
        ticketCrudRepository.deleteById(ticketId);
    }
}
