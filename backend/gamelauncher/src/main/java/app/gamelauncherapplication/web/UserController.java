package app.gamelauncherapplication.web;

import app.gamelauncherapplication.model.User;
import app.gamelauncherapplication.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.net.URISyntaxException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Iterable<User> get() {
        return userService.getUsers();
    }

<<<<<<< HEAD
    @GetMapping("/{id}")
    public User get(@PathVariable Integer id) {
        User requestedUser = userService.getUser(id);
=======
    @GetMapping("/users/{userId}")
    public User get(@PathVariable Integer userId) {
        User requestedUser = userService.get(userId);
>>>>>>> parent of 68bf353 (updated dto)
        if (requestedUser == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return requestedUser;
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) throws URISyntaxException {
        var savedUser = userService.add(user);
        return ResponseEntity.created(new URI("/users/" + savedUser.getId())).body(savedUser);
    }

<<<<<<< HEAD
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userService.remove(id);
=======
    @DeleteMapping("/users/{userId}")
    public void delete(@PathVariable Integer userId) {
        userService.remove(userId);
>>>>>>> parent of 68bf353 (updated dto)
    }
}