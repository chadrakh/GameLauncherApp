package app.gamelauncherapplication;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;

@SpringBootApplication
public class GameLauncherApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameLauncherApplication.class, args);
        mapGamesToDatabase();
    }

    public static void mapGamesToDatabase() {
        try {
            // Establish connection to the H2 database
            Connection connection = DriverManager.getConnection("jdbc:h2:file:~/springboot", "", "");

            // Read the JSON file
            FileReader reader = new FileReader("..../games.json");
            JSONObject gamesJSON = (JSONObject) JSONValue.parseWithException(reader);
            Iterator<String> iterator = gamesJSON.keySet().iterator();
            while (iterator.hasNext()) {
                String game = iterator.next();
                JSONObject productJSON = (JSONObject) gamesJSON.get(game);

                // Get the values from the JSON file
                String title = (String) productJSON.get("title");
                Double price = (Double) productJSON.get("price");
                String summary = (String) productJSON.get("summary");
                String description = (String) productJSON.get("description");
                String releaseDate = (String) productJSON.get("releaseDate");
                JSONArray developer = (JSONArray) productJSON.get("developer");
                JSONArray publisher = (JSONArray) productJSON.get("publisher");
                JSONArray tags = (JSONArray) productJSON.get("tags");
                String rating = (String) productJSON.get("rating");
                JSONArray ratingDescription = (JSONArray) productJSON.get("ratingDescription");
                String trailerLink = (String) productJSON.get("trailerLink");
                String coverImage = (String) productJSON.get("coverImage");
                JSONArray productImages = (JSONArray) productJSON.get("productImages");
                int reviews = (int) productJSON.get("reviews");
                JSONObject minimumSystemRequirements = (JSONObject) productJSON.get("minimumSystemRequirements");
                JSONObject recommendedSystemRequirements = (JSONObject) productJSON.get("recommendedSystemRequirements");

                // Map the values from the JSON file to the H2 database
                String query = "INSERT INTO Games (title, price, summary, description, releaseDate, developer, publisher, tags, rating, ratingDescription, trailerLink, coverImage, productImages, reviews, minimumSystemRequirements, recommendedSystemRequirements) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, title);
                preparedStatement.setDouble(2, price);
                preparedStatement.setString(3, summary);
                preparedStatement.setString(4, description);
                preparedStatement.setString(5, releaseDate);
                preparedStatement.setString(6, developer.toString());
                preparedStatement.setString(7, publisher.toString());
                preparedStatement.setString(8, tags.toString());
                preparedStatement.setString(9, rating);
                preparedStatement.setString(10, ratingDescription.toString());
                preparedStatement.setString(11, trailerLink);
                preparedStatement.setString(12, coverImage);
                preparedStatement.setString(13, productImages.toString());
                preparedStatement.setInt(14, reviews);
                preparedStatement.setString(15, minimumSystemRequirements.toString());
                preparedStatement.setString(16, recommendedSystemRequirements.toString());
                preparedStatement.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

