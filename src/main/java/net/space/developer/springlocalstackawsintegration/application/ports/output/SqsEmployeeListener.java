package net.space.developer.springlocalstackawsintegration.application.ports.output;

import net.space.developer.springlocalstackawsintegration.domain.models.Employee;

import java.util.List;

/**
 * SQS Employee listener output port class
 *
 * @author Lazaro Noel Guerra Medina
 * @since 2025-05-23
 */

public interface SqsEmployeeListener {

    /**
     * Listen all the messages from a given queue
     *
     * @param employees a {@link List} of {@link Employee} information store in the queue
     */
    void listen(List<Employee> employees);
}
