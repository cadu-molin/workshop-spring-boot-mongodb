package com.carlosmolin.workshopmongo.services;

import com.carlosmolin.workshopmongo.domain.User;
import com.carlosmolin.workshopmongo.dto.UserDTO;
import com.carlosmolin.workshopmongo.repositories.UserRepository;
import com.carlosmolin.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User user) {
        return userRepository.insert(user);
    }

    public void delete(String id) {
        findById(id);
        userRepository.deleteById(id);
    }

    public User update(User user) {
        User userSave = findById(user.getId());
        BeanUtils.copyProperties(user, userSave, "id");
        return userRepository.save(userSave);
    }

    public User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
