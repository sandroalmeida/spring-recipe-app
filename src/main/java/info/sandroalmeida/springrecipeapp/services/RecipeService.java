package info.sandroalmeida.springrecipeapp.services;

import info.sandroalmeida.springrecipeapp.domain.Recipe;

import java.util.Set;

/**
 * Created by sandro on 30/01/19
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}