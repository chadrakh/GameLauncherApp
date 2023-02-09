package app.gamelauncherapplication.repository;

import app.gamelauncherapplication.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
