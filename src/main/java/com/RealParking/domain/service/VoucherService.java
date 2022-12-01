package com.RealParking.domain.service;

import com.RealParking.domain.dto.VoucherDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VoucherService {

    private VoucherService voucherService;

    @Autowired
    public VoucherService(VoucherService voucherService) {
        this.voucherService = voucherService;
    }

    public List<VoucherDTO> getAll(){
        return voucherService.getAll();
    }

    public Optional<List<VoucherDTO>> getByVoucherId(int voucherId){
        return voucherService.getByVoucherId(voucherId);
    }

    public Optional<VoucherDTO> getVoucher(int voucherId){
        return voucherService.getVoucher(voucherId);
    }

    public VoucherDTO save (VoucherDTO voucher){
        return voucherService.save(voucher);
    }

    public VoucherDTO update(VoucherDTO voucher){
        return voucherService.update(voucher);
    }

    public Boolean delete(int voucherId){
        return voucherService.delete(voucherId);
    }


}
