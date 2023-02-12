package app.gamelauncherapplication;

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
            FileReader reader = new FileReader("_data/games.json");
            JSONObject gamesJSON = (JSONObject) JSONValue.parseWithException(reader);
            Iterator<String> iterator = gamesJSON.keySet().iterator();
            while (iterator.hasNext()) {
                String game = iterator.next();
                JSONObject gameJSON = (JSONObject) gamesJSON.get(game);

                // Get the values from the JSON file
                Integer id = (Integer) gameJSON.get("gameId");
                String title = (String) gameJSON.get("title");
                Double price = (Double) gameJSON.get("price");
                String summary = (String) gameJSON.get("summary");
                String description = (String) gameJSON.get("description");
                String releaseDate = (String) gameJSON.get("releaseDate");
                String developer = (String) gameJSON.get("developer");
                String publisher = (String) gameJSON.get("publisher");
                String tags = (String) gameJSON.get("tags");
                String rating = (String) gameJSON.get("rating");
                String ratingDescription = (String) gameJSON.get("ratingDescription");
                String trailerLink = (String) gameJSON.get("trailerLink");
                String coverImage = (String) gameJSON.get("coverImage");
                String productImages = (String) gameJSON.get("productImages");
                int reviews = (int) gameJSON.get("reviews");
                String minimumSystemRequirements = (String) gameJSON.get("minimumSystemRequirements");
                String recommendedSystemRequirements = (String) gameJSON.get("recommendedSystemRequirements");

                // Map the values from the JSON file to the H2 database
                String query = "INSERT INTO Games (id, title, price, summary, description, releaseDate, developer, publisher, tags, rating, ratingDescription, trailerLink, coverImage, productImages, reviews, minimumSystemRequirements, recommendedSystemRequirements) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, title);
                preparedStatement.setDouble(3, price);
                preparedStatement.setString(4, summary);
                preparedStatement.setString(5, description);
                preparedStatement.setString(6, releaseDate);
                preparedStatement.setString(7, developer.toString());
                preparedStatement.setString(8, publisher.toString());
                preparedStatement.setString(9, tags.toString());
                preparedStatement.setString(10, rating);
                preparedStatement.setString(11, ratingDescription.toString());
                preparedStatement.setString(12, trailerLink);
                preparedStatement.setString(13, coverImage);
                preparedStatement.setString(14, productImages.toString());
                preparedStatement.setInt(15, reviews);
                preparedStatement.setString(16, minimumSystemRequirements.toString());
                preparedStatement.setString(17, recommendedSystemRequirements.toString());
                preparedStatement.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

