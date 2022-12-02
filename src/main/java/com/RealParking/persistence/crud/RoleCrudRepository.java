package com.RealParking.persistence.crud;

import com.RealParking.domain.dto.RoleDTO;
import org.springframework.data.repository.CrudRepository;

public interface RoleCrudRepository extends CrudRepository<RoleDTO,Integer> {
}
