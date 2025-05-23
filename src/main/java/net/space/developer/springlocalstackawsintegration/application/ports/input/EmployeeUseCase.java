package net.space.developer.springlocalstackawsintegration.application.ports.input;

import net.space.developer.springlocalstackawsintegration.domain.models.Employee;

/**
 * Employee use case input port
 *
 * @author Lazaro Noel Guerra Medina
 * @since 2025-05-23
 */

public interface EmployeeUseCase {

    /**
     * Send the employee information to the topic using SNS
     *
     * @param employee an instance of {@link Employee} with all the information
     */
    void sendEmployeeInfo(Employee employee);
}
