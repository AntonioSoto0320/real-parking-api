package com.RealParking.domain.service;

import com.RealParking.domain.dto.TicketDTO;
import com.RealParking.domain.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TicketService {

    private TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<TicketDTO> getAll(){
        return ticketRepository.getAll();
    }

    public Optional<List<TicketDTO>> getByTicketId(int ticketId){
        return ticketRepository.getByTicketId(ticketId);
    }

    public Optional<TicketDTO> getTicket(int ticketId){
        return ticketRepository.getTicket(ticketId);
    }

    public TicketDTO save (TicketDTO ticket){
        return ticketRepository.save(ticket);
    }

    public TicketDTO update(TicketDTO ticket){
        return ticketRepository.update(ticket);
    }

    public void delete(int ticketId){
         ticketRepository.delete(ticketId);
    }

}
