package app.gamelauncherapplication.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Table("GAMES")
public class Game {
    @Id
    private Integer id;
    private Integer gameId;

    @NotEmpty
    private String title;

    private double price;
    private String summary;
    private String description;
    private String releaseDate;
    private List<String> developer;
    private List<String> publisher;
    private List<String> tags;
    private String rating;
    private List<String> ratingDescription;
    private String trailerLink;
    private String coverImage;
    private List<String> productImages;
    private int reviews;
    private List<Object> minimumSystemRequirements;
    private List<Object> recommendedSystemRequirements;

    public Game() {}

    public Integer getId() { return id; }
    public void setId(Integer _id) {this.id = _id; }

    public Integer getGameId() { return gameId; }

    public void setGameId(Integer _gameId) { this.gameId = _gameId; }

    public String getTitle() {
        return title;
    }
}
