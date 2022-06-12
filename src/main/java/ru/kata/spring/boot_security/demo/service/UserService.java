package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.DTO.UserDTO;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    void saveUser(User user);

    void updateUser(Long id, User user);

    void deletedById(Long id);

    User getUserById(Long id);

    User convertUserDtoToUser(UserDTO userDTO);

    List<User> getAllUsers();

    User getUserByUsername(String username);


}

