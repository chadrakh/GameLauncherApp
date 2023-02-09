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

    public User add(String email, String password) {
        User newUser = new User();
        userRepository.save(newUser);

        return newUser;
    }

    public Iterable<User> get() {
        return userRepository.findAll();
    }

    public User get(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public void remove(Integer userId) {
        userRepository.deleteById(userId);
    }
}
