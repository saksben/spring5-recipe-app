package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description); //tells Spring to add/find UnitsOfMeasure in
    //the sql file by its description value
}
//creates the data repository for UnitOfMeasure so that Recipe data is stored in the db
