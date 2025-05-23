package net.space.developer.springlocalstackawsintegration.infrastructure.adapters.output;

import io.awspring.cloud.sqs.annotation.SnsNotificationMessage;
import io.awspring.cloud.sqs.annotation.SqsListener;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.space.developer.springlocalstackawsintegration.application.ports.output.SqsEmployeeListener;
import net.space.developer.springlocalstackawsintegration.common.annotations.EmployeeListener;
import net.space.developer.springlocalstackawsintegration.domain.models.Employee;

import java.util.List;

import static net.space.developer.springlocalstackawsintegration.common.constants.ApplicationConstants.SQS_INFO_QUEUE;

/**
 * Employee listener implementation class
 *
 * @author Lazaro Noel Guerra Medina
 * @since 2025-05-23
 */

@Slf4j
@EmployeeListener
@RequiredArgsConstructor
public class EmployeeListenerImpl implements SqsEmployeeListener {

    /**
     * {@inheritDoc}
     */
    @Override
    @SqsListener(SQS_INFO_QUEUE)
    public void listen(@SnsNotificationMessage List<Employee> employees) {
        log.info("Message received: {}", employees);
    }

}
