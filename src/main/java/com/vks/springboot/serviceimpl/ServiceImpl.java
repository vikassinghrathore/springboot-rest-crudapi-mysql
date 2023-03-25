package com.vks.springboot.serviceimpl;

import com.vks.springboot.entity.User;
import com.vks.springboot.repository.UserRepository;
import com.vks.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.of(userRepository.findById(id).get());
    }

    @Override
    public User updateUser(User user) {
        userRepository.findById(user.getId()).get();
        return userRepository.save(user).builder()
                .id(user.getId()).firstName(user.getFirstName()).lastName(user.getLastName()).email(user.getEmail())
                .build();

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
