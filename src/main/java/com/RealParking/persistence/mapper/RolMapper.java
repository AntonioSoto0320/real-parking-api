package com.RealParking.persistence.mapper;

import com.RealParking.domain.dto.RoleDTO;
import com.RealParking.domain.dto.TicketDTO;
import com.RealParking.persistence.entity.Rol;
import com.RealParking.persistence.entity.Ticket;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import javax.persistence.ManyToOne;

@Mapper(componentModel = "spring")
public interface RolMapper {

    @Mappings({
            @Mapping(source ="idRol" ,target = "idRole"),
            @Mapping(source ="descripcion" ,target = "description"),
            @Mapping(source ="estado" ,target = "stateRol")

    })
    RoleDTO toRolDTO(Rol rol);

    @InheritInverseConfiguration
    Rol toRol(RoleDTO roleDTO);

}
