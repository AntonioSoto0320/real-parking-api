package com.RealParking.domain.repository;

import com.RealParking.domain.dto.VoucherDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface VoucherRepository {

    List<VoucherDTO> getAll();
    Optional<List<VoucherDTO>> getByVoucherId(int voucherId);
    Optional<VoucherDTO> getVoucher(int voucherId);
    VoucherDTO save (VoucherDTO voucher);
    VoucherDTO update(VoucherDTO voucher);
    void delete(int voucherId);

}
