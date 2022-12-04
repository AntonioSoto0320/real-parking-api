package com.RealParking.persistence.crud;


import com.RealParking.persistence.entity.Incidente;
import org.springframework.data.repository.CrudRepository;

public interface IncidentCrudRepository extends CrudRepository<Incidente,Integer> {
}
