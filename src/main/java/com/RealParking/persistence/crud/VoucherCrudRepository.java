package com.RealParking.persistence.crud;

import com.RealParking.domain.dto.VoucherDTO;
import org.springframework.data.repository.CrudRepository;

public interface VoucherCrudRepository extends CrudRepository<VoucherDTO,Integer> {

}
