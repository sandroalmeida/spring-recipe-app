package info.sandroalmeida.springrecipeapp.repositories;

import info.sandroalmeida.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sandro on 23/01/19
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
