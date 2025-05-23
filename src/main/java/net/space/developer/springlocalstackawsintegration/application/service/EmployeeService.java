package net.space.developer.springlocalstackawsintegration.application.service;

import io.awspring.cloud.sns.core.SnsTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.space.developer.springlocalstackawsintegration.application.model.NotificationModel;
import net.space.developer.springlocalstackawsintegration.application.ports.input.EmployeeUseCase;
import net.space.developer.springlocalstackawsintegration.common.annotations.UseCase;
import net.space.developer.springlocalstackawsintegration.domain.models.Employee;

import static net.space.developer.springlocalstackawsintegration.common.constants.EmployeeConstants.EMPLOYEE_SUBJECT;

/**
 * Employee service class to define the implementation of the uses cases
 *
 * @author Lazaro Noel Guerra Medina
 * @since 2025-05-23
 */

@Slf4j
@UseCase
@RequiredArgsConstructor
public class EmployeeService implements EmployeeUseCase {

    /**
     * SNS template dependency injection
     */
    private final SnsTemplate snsTemplate;

    /**
     * Notification model dependency injection
     */
    private final NotificationModel notificationModel;

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendEmployeeInfo(Employee employee) {
        this.snsTemplate.sendNotification(this.notificationModel.getTopic(), employee, EMPLOYEE_SUBJECT);
        log.info("Notification sent successfully: {}", employee);
    }

}
