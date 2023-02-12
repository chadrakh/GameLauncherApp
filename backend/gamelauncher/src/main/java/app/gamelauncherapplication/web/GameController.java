package app.gamelauncherapplication.web;

import app.gamelauncherapplication.model.Game;
import app.gamelauncherapplication.model.User;
import app.gamelauncherapplication.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public Iterable<Game> get() {
        return gameService.getUsers();
    }

    @GetMapping("/{id}")
    public Game get(@PathVariable Integer id) {
        Game requestedGame = gameService.getUser(id);
        if (requestedGame == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return requestedGame;
    }

    @PostMapping("/games")
    public ResponseEntity<Game> create(@RequestBody Game game) throws URISyntaxException {
        var savedGame = gameService.add(game);
        return ResponseEntity.created(new URI("/games/" + savedGame.getId())).body(savedGame);
    }

    @DeleteMapping("/games/{id}")
    public void delete(@PathVariable Integer id) {
        gameService.remove(id);
    }

}