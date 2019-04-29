package info.sandroalmeida.springrecipeapp.services;

import info.sandroalmeida.springrecipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by sandro on 29/04/19
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();

}
