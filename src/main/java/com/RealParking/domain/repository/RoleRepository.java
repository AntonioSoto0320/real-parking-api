package com.RealParking.domain.repository;

import com.RealParking.domain.dto.RoleDTO;


import java.util.List;
import java.util.Optional;


public interface RoleRepository {

    List<RoleDTO> getAll();
    Optional<List<RoleDTO>> getByRoletId(int roleId);
    Optional<RoleDTO> getRole(int roleId);
    RoleDTO save (RoleDTO role);
    RoleDTO update(RoleDTO role);
    Boolean delete(int roleId);

}
