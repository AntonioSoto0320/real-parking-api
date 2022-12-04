package com.RealParking.persistence;

import com.RealParking.domain.User;
import com.RealParking.domain.dto.VoucherDTO;
import com.RealParking.domain.repository.VoucherRepository;
import com.RealParking.persistence.crud.VoucherCrudRepository;
import com.RealParking.persistence.entity.Comprobante;
import com.RealParking.persistence.mapper.ComprobanteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class ComprobanteRepository implements VoucherRepository {

    private VoucherCrudRepository voucherCrudRepository;
    private ComprobanteMapper comprobanteMapper;

    @Autowired
    public ComprobanteRepository(VoucherCrudRepository voucherCrudRepository, ComprobanteMapper comprobanteMapper) {
        this.voucherCrudRepository = voucherCrudRepository;
        this.comprobanteMapper = comprobanteMapper;
    }


    @Override
    public List<VoucherDTO> getAll() {
        return  comprobanteMapper.toVoucherDTOs((List<Comprobante>) voucherCrudRepository.findAll());
    }

    @Override
    public Optional<List<VoucherDTO>> getByVoucherId(int voucherId) {

     List<Comprobante> comprobantes = voucherCrudRepository.findByIdComprobante(voucherId);

     return  Optional.of(comprobanteMapper.toVoucherDTOs(comprobantes));

    }

    @Override
    public Optional<VoucherDTO> getVoucher(int voucherId) {
        return voucherCrudRepository.findById(voucherId).
                map(comprobante -> comprobanteMapper.toVoucherDTO(comprobante));
    }

    @Override
    public VoucherDTO save(VoucherDTO voucher) {
        Comprobante comprobante =comprobanteMapper.toComprobante(voucher);

        return comprobanteMapper.toVoucherDTO(comprobante);

    }

    @Override
    public VoucherDTO update(VoucherDTO voucher) {
        return getVoucher(voucher.getIdVoucher()).map(voucherDTO -> {
        voucherDTO.setTicket(voucher.getTicket());
        voucherDTO.setUser(voucher.getUser());
        voucherDTO.setDate(voucher.getDate());
        voucherDTO.setAmount(voucher.getAmount());
        Comprobante comprobante = comprobanteMapper.toComprobante(voucherDTO);
        return save(comprobanteMapper.toVoucherDTO(comprobante));

        }).orElse(null);
    }

    @Override
    public void delete(int voucherId) {

        voucherCrudRepository.deleteById(voucherId);

    }
}
