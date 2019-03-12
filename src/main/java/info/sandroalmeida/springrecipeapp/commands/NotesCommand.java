package info.sandroalmeida.springrecipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by sandro on 12/03/19
 */

@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {

    private Long id;
    private String recipeNotes;
}
