package com.RealParking.persistence;

import com.RealParking.domain.dto.UserDTO;
import com.RealParking.domain.repository.UserRepository;
import com.RealParking.persistence.crud.UserCrudRepository;
import com.RealParking.persistence.entity.Usuario;
import com.RealParking.persistence.mapper.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository implements UserRepository {

    private UserCrudRepository userCrudRepository;

    private UsuarioMapper usuarioMapper;

    @Autowired
    public UsuarioRepository(UserCrudRepository userCrudRepository, UsuarioMapper usuarioMapper) {
        this.userCrudRepository = userCrudRepository;
        this.usuarioMapper = usuarioMapper;
    }

    @Override
    public List<UserDTO> getAll() {
        return  usuarioMapper.toUserDTOs((List<Usuario>) userCrudRepository.findAll());
    }

    @Override
    public Optional<List<UserDTO>> getByUserId(int userId) {
        return userCrudRepository.findByIdUser(userId)
                .map(user -> usuarioMapper.toUserDTOs(user));
    }

    @Override
    public Optional<UserDTO> getUser(int userId) {
        return userCrudRepository.findById(userId)
                .map(usuario -> usuarioMapper.toUserDTO(usuario));
    }

    @Override
    public UserDTO save(UserDTO user) {
        Usuario usuario = usuarioMapper.toUsuario(user);
        return usuarioMapper.toUserDTO(userCrudRepository.save(usuario));
    }

    @Override
    public UserDTO update(UserDTO user) {

        return getUser(user.getIdUser()).map(userUpdate -> {
               userUpdate.setIdUser(user.getIdUser());
               userUpdate.setUser(user.getUser());
               userUpdate.setPassword(user.getPassword());
               userUpdate.setFullName(user.getFullName());
               userUpdate.setStateUser(user.getStateUser());
               userUpdate.setRole(user.getRole());
               userUpdate.setPhoto(user.getPhoto());

               Usuario usuario = usuarioMapper.toUsuario(userUpdate);
               return save(usuarioMapper.toUserDTO(usuario));

        }).orElse(null);
    }

    @Override
    public void delete(int userId) {
        userCrudRepository.deleteById(userId);
    }
}
