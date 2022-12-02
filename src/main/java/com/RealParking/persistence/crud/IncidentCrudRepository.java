package com.RealParking.persistence.crud;

import com.RealParking.domain.dto.IncidentDTO;
import org.springframework.data.repository.CrudRepository;

public interface IncidentCrudRepository extends CrudRepository<IncidentDTO,Integer> {
}
