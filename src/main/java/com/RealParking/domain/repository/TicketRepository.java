package com.RealParking.domain.repository;

import com.RealParking.domain.dto.TicketDTO;


import java.util.List;
import java.util.Optional;


public interface TicketRepository {

    List<TicketDTO> getAll();
    Optional<List<TicketDTO>> getByTicketId(int ticketId);
    Optional<TicketDTO> getTicket(int ticketId);
    TicketDTO save (TicketDTO ticket);
    TicketDTO update(TicketDTO ticket);
    Boolean delete(int ticketId);

}
