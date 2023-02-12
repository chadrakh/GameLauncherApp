package app.gamelauncherapplication.service;

import app.gamelauncherapplication.model.User;
import app.gamelauncherapplication.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User add(User newUser) {
        userRepository.save(newUser);
        return newUser;
    }

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public void remove(Integer userId) {
        userRepository.deleteById(userId);
    }
}