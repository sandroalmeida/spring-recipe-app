package info.sandroalmeida.springrecipeapp.services;

import info.sandroalmeida.springrecipeapp.commands.IngredientCommand;

/**
 * Created by sandro on 29/04/19
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);

}
