package com.RealParking.persistence.mapper;


import com.RealParking.persistence.entity.Ticket;
import com.RealParking.domain.dto.TicketDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TicketMapper {

    @Mappings({
            @Mapping(source = "idTicket" ,target = "idTicket"),
            @Mapping(source = "placa" ,target = "placa"),
            @Mapping(source = "horaIngreso" ,target = "entryTime"),
            @Mapping(source = "horaSalida" ,target = "departureTime"),
            @Mapping(source = "estado" ,target = "stateTicket")

    })
    TicketDTO toTicketDTO(Ticket ticket);

    List<TicketDTO> toTicketDTOs(List<Ticket> tickets);

    @InheritInverseConfiguration
    Ticket toTicket(TicketDTO ticketDTO);

}
