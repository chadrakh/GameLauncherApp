package app.gamelauncherapplication.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
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

    public Integer getId() { return id; }
    public void setId(Integer _id) {this.id = _id; }

    public String getTitle() {
        return title;
    }
}
