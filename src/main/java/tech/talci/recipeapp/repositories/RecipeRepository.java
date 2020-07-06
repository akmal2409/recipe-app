package tech.talci.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import tech.talci.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
