package com.RealParking.persistence.mapper;

import com.RealParking.domain.dto.VoucherDTO;
import com.RealParking.persistence.entity.Comprobante;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@Mapper(componentModel = "spring")
public interface ComprobanteMapper {

    @Mappings({
            @Mapping(source = "idComprobante" ,target = "idVoucher"),
            @Mapping(source = "ticket" ,target = "ticket"),
            @Mapping(source = "usuario" ,target = "user"),
            @Mapping(source = "fecha" ,target = "date"),
            @Mapping(source = "importe" ,target = "amount"),

    })
    VoucherDTO toVoucherDTO(Comprobante comprobante);

    List<VoucherDTO>  toVoucherDTOs(List<Comprobante> comprobantes);

    @InheritInverseConfiguration
    Comprobante toComprobante(VoucherDTO voucherDTO);

}
