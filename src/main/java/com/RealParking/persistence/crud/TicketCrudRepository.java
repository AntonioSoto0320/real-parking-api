package com.RealParking.persistence.crud;



import com.RealParking.persistence.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketCrudRepository extends CrudRepository<Ticket,Integer> {

    public List<Ticket> findByIdTicket(int idTicket);
}
