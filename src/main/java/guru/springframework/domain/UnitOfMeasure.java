package guru.springframework.domain;

import javax.persistence.*;

@Entity //represents a table in the db
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates an id value
    private Long id;
    private String description; //will be the value identifier for the db column "description"

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
}
