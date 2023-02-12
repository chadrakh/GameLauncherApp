package app.gamelauncherapplication;

import app.gamelauncherapplication.service.GameService;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.transaction.support.TransactionSynchronizationManager.getResource;

@SpringBootApplication
public class GameLauncherApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameLauncherApplication.class, args);

        GameService.mapGamesToDatabase();
    }


}