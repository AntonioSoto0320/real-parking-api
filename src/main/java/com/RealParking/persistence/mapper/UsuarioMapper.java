package com.RealParking.persistence.mapper;

import com.RealParking.domain.dto.UserDTO;
import com.RealParking.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mappings({
            @Mapping(source = "idUsuarios",target ="idUser" ),
            @Mapping(source ="usuario" ,target ="user" ),
            @Mapping(source ="contraseña" ,target = "password"),
            @Mapping(source ="nombreCompleto" ,target = "fullName"),
            @Mapping(source ="estado" ,target = "stateUser"),
            @Mapping(source ="foto" ,target = "photo"),
            @Mapping(source ="rol" ,target = "role")

    })
    UserDTO toUserDTO(Usuario usuario);

    @InheritInverseConfiguration
    Usuario toUsuario(UserDTO userDTO);

}
