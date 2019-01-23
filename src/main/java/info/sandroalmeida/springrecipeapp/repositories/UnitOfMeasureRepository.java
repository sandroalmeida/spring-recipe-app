package info.sandroalmeida.springrecipeapp.repositories;

import info.sandroalmeida.springrecipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by sandro on 23/01/19
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
