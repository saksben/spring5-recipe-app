package guru.springframework.domain;

import javax.persistence.*;

@Entity //represents a table in the db
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates an id value
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob //creates a CLOB object
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
