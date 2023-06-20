package guru.springframework.domain;

import javax.persistence.*;
import java.util.Set;

@Entity //represents a table in the db
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates an id value
    private Long id;
    private String description; //will be the value identifier for the db column "description"
    @ManyToMany(mappedBy = "categories") //the categories will be saved in Recipe's "categories" Set
    private Set<Recipe> recipes;

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

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
