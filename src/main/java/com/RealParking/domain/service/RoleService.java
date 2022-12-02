package com.RealParking.domain.service;

import com.RealParking.domain.dto.RoleDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RoleService {

    private RoleService roleService;

    @Autowired
    public RoleService(RoleService roleService) {
        this.roleService = roleService;
    }


    public List<RoleDTO> getAll(){
        return roleService.getAll();
    }

    public Optional<List<RoleDTO>> getByRoletId(int roleId){
        return roleService.getByRoletId(roleId);
    }

    public Optional<RoleDTO> getRole(int roleId){
        return roleService.getRole(roleId);
    }

    public RoleDTO save (RoleDTO role){
        return roleService.save(role);
    }

    public RoleDTO update(RoleDTO role){
        return roleService.update(role);
    }

    public void delete(int roleId){
         roleService.delete(roleId);
    }
}
