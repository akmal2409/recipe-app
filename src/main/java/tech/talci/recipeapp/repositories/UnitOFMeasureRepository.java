package tech.talci.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.talci.recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOFMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
