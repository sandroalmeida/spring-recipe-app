package info.sandroalmeida.springrecipeapp.repositories;

import info.sandroalmeida.springrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by sandro on 23/01/19
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
