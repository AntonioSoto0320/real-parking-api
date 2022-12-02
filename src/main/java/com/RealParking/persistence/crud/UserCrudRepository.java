package com.RealParking.persistence.crud;

import com.RealParking.domain.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<UserDTO,Integer> {



}
