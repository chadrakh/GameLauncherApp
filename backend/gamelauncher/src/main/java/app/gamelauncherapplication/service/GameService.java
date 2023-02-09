package app.gamelauncherapplication.service;

import app.gamelauncherapplication.model.Game;
import app.gamelauncherapplication.repository.GameRepository;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game add(String title) {
        Game newGame = new Game();
        gameRepository.save(newGame);

        return newGame;
    }

    public Iterable<Game> get() {
        return gameRepository.findAll();
    }

    public Game get(Integer gameId) {
        return gameRepository.findById(gameId).orElse(null);
    }

    public void remove(Integer gameId) {
        gameRepository.deleteById(gameId);
    }
}
