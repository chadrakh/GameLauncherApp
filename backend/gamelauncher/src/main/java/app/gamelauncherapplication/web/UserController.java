package app.gamelauncherapplication.web;

import app.gamelauncherapplication.model.User;
import app.gamelauncherapplication.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Iterable<User> get() {
        return userService.get();
    }

    @GetMapping("/users/{userId}")
    public User get(@PathVariable Integer userId) {
        User requestedUser = userService.get(userId);
        if (requestedUser == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return requestedUser;
    }

    @PostMapping("/users")
    public User create(@RequestBody @Valid User newUser) {
        return userService.add(newUser.getEmail(), newUser.getPassword());
    }

    @DeleteMapping("/users/{userId}")
    public void delete(@PathVariable Integer userId) {
        userService.remove(userId);
    }
}
