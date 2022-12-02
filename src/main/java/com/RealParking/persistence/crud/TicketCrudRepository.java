package com.RealParking.persistence.crud;

import com.RealParking.domain.dto.TicketDTO;
import org.springframework.data.repository.CrudRepository;

public interface TicketCrudRepository extends CrudRepository<TicketDTO,Integer> {
}
