package tech.talci.recipeapp.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tech.talci.recipeapp.commands.IngredientCommand;
import tech.talci.recipeapp.converters.IngredientToIngredientCommand;
import tech.talci.recipeapp.converters.UnitOfMeasureToUnitOfMeasureCommand;
import tech.talci.recipeapp.domain.Ingredient;
import tech.talci.recipeapp.domain.Recipe;
import tech.talci.recipeapp.repositories.RecipeRepository;

import javax.crypto.spec.OAEPParameterSpec;
import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.text.html.Option;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

public class IngredientServiceImplTest {

    IngredientService ingredientService;
    private final IngredientToIngredientCommand converter;

    @Mock
    RecipeRepository recipeRepository;

    public IngredientServiceImplTest() {
        this.converter = new IngredientToIngredientCommand(new UnitOfMeasureToUnitOfMeasureCommand());
    }

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        ingredientService = new IngredientServiceImpl(converter, recipeRepository);
    }

    @Test
    public void findByRecipeIdAndIngredientId() {
        //given
        Recipe recipe = new Recipe();
        recipe.setId(1L);

        Ingredient ingredient1 = new Ingredient();
        ingredient1.setId(1L);

        Ingredient ingredient2 = new Ingredient();
        ingredient2.setId(2L);

        Ingredient ingredient3 = new Ingredient();
        ingredient3.setId(3L);

        recipe.addIngredient(ingredient1);
        recipe.addIngredient(ingredient2);
        recipe.addIngredient(ingredient3);
        Optional<Recipe> recipeOptional = Optional.of(recipe);

        //when
        when(recipeRepository.findById(anyLong())).thenReturn(recipeOptional);

        //then
        IngredientCommand command = ingredientService.findByRecipeIdAndIngredientId(1L, 3L);

        assertEquals(Long.valueOf(3L), command.getId());
        assertEquals(Long.valueOf(1L), command.getRecipeId());
        verify(recipeRepository, times(1)).findById(anyLong());
    }
}