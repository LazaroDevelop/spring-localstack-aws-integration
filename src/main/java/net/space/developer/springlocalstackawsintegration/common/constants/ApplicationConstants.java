package net.space.developer.springlocalstackawsintegration.common.constants;

/**
 * Application constants utility class
 *
 * @author Lazaro Noel Guerra Medina
 * @since 2025-05-23
 */

public final class ApplicationConstants {

    // YML Properties
    public static final String SNS_TOPIC_PREFIX = "info.sns";
    public static final String SQS_INFO_QUEUE = "${info.sqs.queue}";

    // Controller routes
    public static final String CONTROLLER_MAPPING = "/v1/api/employee";
    public static final String SEND_ENDPOINT_ROUTE = "/send";

    private ApplicationConstants(){}
}
