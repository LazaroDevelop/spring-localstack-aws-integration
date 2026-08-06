package net.space.developer.springlocalstackawsintegration.infrastructure.adapters.input;


import lombok.RequiredArgsConstructor;
import net.space.developer.springlocalstackawsintegration.application.ports.input.EmployeeUseCase;
import net.space.developer.springlocalstackawsintegration.common.annotations.InputAdapter;
import net.space.developer.springlocalstackawsintegration.domain.models.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static net.space.developer.springlocalstackawsintegration.common.constants.ApplicationConstants.CONTROLLER_MAPPING;
import static net.space.developer.springlocalstackawsintegration.common.constants.ApplicationConstants.SEND_ENDPOINT_ROUTE;

/**
 * Employee Controller class to manage all the endpoints
 *
 * @author Lazaro Noel Guerra Medina
 * @since 2025-05-23
 */

@CrossOrigin
@InputAdapter
@RequiredArgsConstructor
@RequestMapping(CONTROLLER_MAPPING)
public class EmployeeController {

    /**
     * Employee use case dependency injection
     */
    private final EmployeeUseCase employeeUseCase;

    /**
     * Endpoint that send the information about one employee to specific topic
     *
     * @param employee an instance of {@link Employee} with all the information
     * @return a {@link ResponseEntity} with response information
     */
    @PostMapping(SEND_ENDPOINT_ROUTE)
    public ResponseEntity<Employee> sendEmployeeInformation(@RequestBody final Employee employee) {

        employeeUseCase.sendEmployeeInfo(employee);

        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
}
