package guru.springframework.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity //represents a table in the db
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates an id value
    private Long id;

    private String description; //will be the value identifier for the db column "description"
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER) //tells Hibernate this is to be retrieved every time from the db
    private UnitOfMeasure uom;

    @ManyToOne //many Ingredients to 1 Recipe. Not cascaded because you don't want the parent object
        // (Recipe) to be deleted if an ingredient gets deleted
    private Recipe recipe;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public UnitOfMeasure getUom() {
        return uom;
    }

    public void setUom(UnitOfMeasure uom) {
        this.uom = uom;
    }
}
