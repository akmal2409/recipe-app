package tech.talci.recipeapp.services;

import tech.talci.recipeapp.commands.RecipeCommand;
import tech.talci.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
