package com.RealParking.domain.service;

import com.RealParking.domain.dto.UserDTO;
import com.RealParking.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getAll(){
       return userRepository.getAll();
    }

    public Optional<List<UserDTO>> getByUserId(int userId){
        return userRepository.getByUserId(userId);
    }

    public Optional<UserDTO> getUser(int userId){
        return userRepository.getUser(userId);
    }

    public UserDTO save(UserDTO user){
        return userRepository.save(user);
    }

    public UserDTO update(UserDTO user){
        return userRepository.update(user);
    }

    public  void delete(int userId){
         userRepository.delete(userId);
    }


}
