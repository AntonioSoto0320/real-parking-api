package com.RealParking.persistence.crud;


import com.RealParking.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<Usuario,Integer> {

public Optional<List<Usuario>> findByIdUser(int idUser);

}
