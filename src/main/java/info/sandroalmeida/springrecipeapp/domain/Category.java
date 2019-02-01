package info.sandroalmeida.springrecipeapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by sandro on 23/01/19
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
