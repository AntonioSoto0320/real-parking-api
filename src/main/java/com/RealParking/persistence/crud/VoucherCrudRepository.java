package com.RealParking.persistence.crud;


import com.RealParking.domain.dto.VoucherDTO;
import com.RealParking.persistence.entity.Comprobante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VoucherCrudRepository extends CrudRepository<Comprobante,Integer> {

    public List<Comprobante> findByIdComprobante(int idComprobante);

}
