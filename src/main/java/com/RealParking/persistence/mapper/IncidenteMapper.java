package com.RealParking.persistence.mapper;

import com.RealParking.domain.dto.IncidentDTO;
import com.RealParking.persistence.entity.Incidente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IncidenteMapper {

    @Mappings({
            @Mapping(source = "idIncidente",target = "idIncident"),
            @Mapping(source = "ticket",target = "ticket"),
            @Mapping(source = "usuario",target = "user"),
            @Mapping(source = "dni",target = "dni"),
            @Mapping(source = "nombreCompleto",target = "fullName"),
            @Mapping(source = "fecha",target = "date"),
    })
    IncidentDTO toIncidentDTO(Incidente incidente);

    @InheritInverseConfiguration
    Incidente toIncidente(IncidentDTO incidentDTO);

}
