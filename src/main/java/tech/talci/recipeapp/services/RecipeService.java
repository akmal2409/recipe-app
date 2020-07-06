package tech.talci.recipeapp.services;

import tech.talci.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
