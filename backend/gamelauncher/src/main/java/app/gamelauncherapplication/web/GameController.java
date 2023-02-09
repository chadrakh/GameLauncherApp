package app.gamelauncherapplication.web;

import app.gamelauncherapplication.model.Game;
import app.gamelauncherapplication.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    public Iterable<Game> get() {
        return gameService.get();
    }

    @GetMapping("/games/{gameId}")
    public Game get(@PathVariable  Integer gameId) {
        Game requestedGame = gameService.get(gameId);
        if (requestedGame == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return requestedGame;
    }

    @PostMapping("/games")
    public Game create(@RequestBody @Valid Game newGame) {
        return gameService.add(newGame.getTitle());
    }

    @DeleteMapping("/games/{gameId}")
    public void delete(@PathVariable Integer gameId) {
        gameService.remove(gameId);
    }

}