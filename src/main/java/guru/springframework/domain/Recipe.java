package guru.springframework.domain;

import javax.persistence.*;
import java.util.Set;

@Entity //represents a table in the db
public class Recipe {
    //variables are different columns on the db

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates an id value
    private Long id;

    private String description; //will be the value identifier for the db column "description"
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe") //one Recipe has many Ingredients. The recipe
        // will be saved on the child/Ingredient property that is called "recipe". When something happens to
        //the master class, it happens to the other
    private Set<Ingredient> ingredients;
    @Lob //creates a BLOB for the image
    private Byte[] image;
    @OneToOne(cascade = CascadeType.ALL) //when something happens to the master class, it happens to the other
    private Notes notes;
    @Enumerated(value = EnumType.STRING) //an enum is used. Type String uses String value instead of ordered numbers
    private Difficulty difficulty;
    @ManyToMany
    @JoinTable(name = "recipe_category", //make a table called "recipe_category"
            joinColumns = @JoinColumn(name = "recipe_id"), //join shared info on a column called "recipe_id"
            inverseJoinColumns = @JoinColumn(name = "category_id")) //put the other info into a column "category_id"
    private Set<Category> categories;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
