package it.carmelolagamba.sbam.adapters.command;

/**
 * ICommand interface defines a contract for command objects that execute a specific action
 * and return a Data Transfer Object (DTO) as a result.
 *
 * @param <OUTPUT_MODEL> the type of the Data Transfer Object returned by the command execution
 * @Since 2.1
 * @Author carmelolg
 */
public interface ICommand<OUTPUT_MODEL> {
    OUTPUT_MODEL execute();
}
