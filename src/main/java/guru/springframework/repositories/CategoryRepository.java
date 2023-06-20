package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description); //tells Spring to add/find Categories in
        //the sql file by its description value
}
//creates the data repository for Category so that Recipe data is stored in the db