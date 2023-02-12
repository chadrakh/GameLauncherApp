package app.gamelauncherapplication.model;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

@Table("GAMES")
public class Game {
    @Id
    private Integer id;

    @NotEmpty
    private String title;

    private double price;
    private String summary;
    private String description;
    private String releaseDate;
    private String developer;
    private String publisher;
    private String tags;
    private String rating;
    private String ratingDescription;
    private String trailerLink;
    private String coverImage;
    private String productImages;
    private int reviews;
    private String minimumSystemRequirementsId;
    private String recommendedSystemRequirementsId;

    public Game() {}

    public Game(Integer _id, String _title, double _price, String _summary, String _description, String _releaseDate, String _developer, String _publisher, String _tags, String _rating, String _ratingDescription, String _trailerLink, String _coverImage, String _productImages, int _reviews, String _minimumSystemRequirementsId, String _recommendedSystemRequirementsId) {
        this.id = _id;
        this.title = _title;
        this.price = _price;
        this.summary = _summary;
        this.description = _description;
        this.releaseDate = _releaseDate;
        this.developer = _developer;
        this.publisher = _publisher;
        this.tags = _tags;
        this.rating = _rating;
        this.ratingDescription = _ratingDescription;
        this.trailerLink = _trailerLink;
        this.coverImage = _coverImage;
        this.productImages = _productImages;
        this.reviews = _reviews;
        this.minimumSystemRequirementsId = _minimumSystemRequirementsId;
        this.recommendedSystemRequirementsId = _recommendedSystemRequirementsId;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer _id) {
        this.id = _id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String _title) {
        this.title = _title;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double _price) {
        this.price = _price;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String _summary) {
        this.summary = _summary;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String _description) {
        this.description = _description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String _releaseDate) {
        this.releaseDate = _releaseDate;
    }

    public String getDeveloper() {
        return developer;
    }
    public void setDeveloper(String _developer) {
        this.developer = _developer;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String _publisher) {
        this.publisher = _publisher;
    }

    public String getTags() {
        return tags;
    }
    public void setTags(String _tags) {
        this.tags = _tags;
    }

    public String getRating() {
        return rating;
    }
    public void setRating(String _rating) {
        this.rating = _rating;
    }

    public String getRatingDescription() {
        return ratingDescription;
    }
    public void setRatingDescription(String _ratingDescription) {
        this.ratingDescription = _ratingDescription;
    }

    public String getTrailerLink() {
        return trailerLink;
    }
    public void setTrailerLink(String _trailerLink) {
        this.trailerLink = _trailerLink;
    }

    public String getCoverImage() {
        return coverImage;
    }
    public void setCoverImage(String _coverImage) {
        this.coverImage = _coverImage;
    }

    public String getProductImages() {
        return productImages;
    }
    public void setProductImages(String _productImages) {
        this.productImages = _productImages;
    }

    public int getReviews() {
        return reviews;
    }
    public void setReviews(int _reviews) {
        this.reviews = _reviews;
    }

    public String getMinimumSystemRequirementsId() {
        return minimumSystemRequirementsId;
    }
    public void setMinimumSystemRequirementsId(String _minimumSystemRequirementsId) {
        this.minimumSystemRequirementsId = _minimumSystemRequirementsId;
    }

    public String getRecommendedSystemRequirementsId() {
        return recommendedSystemRequirementsId;
    }
    public void setRecommendedSystemRequirementsId(String _recommendedSystemRequirementsId) {
        this.recommendedSystemRequirementsId = _recommendedSystemRequirementsId;
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
                var game = gamesJsonArray.get(i).toString();
                gamesArray.add(game);
            }

            System.out.println(gamesArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
