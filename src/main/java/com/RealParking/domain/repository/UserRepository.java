package com.RealParking.domain.repository;

import com.RealParking.domain.dto.UserDTO;


import java.util.List;
import java.util.Optional;


public interface UserRepository {

    List<UserDTO> getAll();
    Optional<List<UserDTO>> getByUserId(int userId);
    Optional<UserDTO> getUser(int userId);
    UserDTO save (UserDTO user);
    UserDTO update(UserDTO user);
    void delete(int userId);

}
