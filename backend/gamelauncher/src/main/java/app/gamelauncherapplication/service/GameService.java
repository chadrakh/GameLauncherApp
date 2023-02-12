package app.gamelauncherapplication.service;

import app.gamelauncherapplication.model.Game;
import app.gamelauncherapplication.repository.GameRepository;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game add(Game newGame) {
        gameRepository.save(newGame);
        return newGame;
    }

    public Iterable<Game> getUsers() {
        return gameRepository.findAll();
    }

    public Game getUser(Integer gameId) {
        return gameRepository.findById(gameId).orElse(null);
    }

    public void remove(Integer gameId) {
        gameRepository.deleteById(gameId);
    }

    public static void mapGamesToDatabase() {

        try {
            // Establish connection to the H2 database
            Connection connection = DriverManager.getConnection("jdbc:h2:file:~/springboot", "", "");

            // Read the JSON file
            JSONParser jsonParser = new JSONParser();

            FileReader gamesJson = new FileReader("src/main/java/app/gamelauncherapplication/_data/games.json");
            JSONArray gamesJsonArray = (JSONArray) jsonParser.parse(gamesJson);

            List gamesArray = new ArrayList<>();

            for (int i = 0; i < gamesJsonArray.size(); i++) {
                var game = gamesJsonArray.get(i);
                gamesArray.add(game);
            }

            System.out.println(gamesArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}