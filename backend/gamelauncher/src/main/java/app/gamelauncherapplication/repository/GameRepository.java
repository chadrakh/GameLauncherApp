package app.gamelauncherapplication.repository;

import app.gamelauncherapplication.model.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Integer> {
}
