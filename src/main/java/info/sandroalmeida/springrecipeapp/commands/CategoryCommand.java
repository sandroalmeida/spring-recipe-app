package info.sandroalmeida.springrecipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by sandro on 12/03/19
 */

@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {

    private Long id;
    private String description;
}
