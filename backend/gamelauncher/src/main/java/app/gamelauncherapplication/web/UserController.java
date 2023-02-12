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

    @GetMapping("/users/{id}")
    public User get(@PathVariable Integer id) {
        User requestedUser = userService.get(id);
        if (requestedUser == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return requestedUser;
    }

    @PostMapping("/users")
    public User create(@RequestBody @Valid User newUser) {
        return userService.add(newUser.getFirstName(), newUser.getLastName(), newUser.getEmail(), newUser.getPassword());
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Integer id) {
        userService.remove(id);
    }
}
