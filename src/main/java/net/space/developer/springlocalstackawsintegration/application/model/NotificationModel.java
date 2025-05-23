package net.space.developer.springlocalstackawsintegration.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.space.developer.springlocalstackawsintegration.common.annotations.CustomComponent;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Notification model class
 * Using configuration properties to read attributes from application.yml
 *
 * @author Lazaro Noel Guerra Medina
 * @since 2025-05-23
 */

@Data
@CustomComponent
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "info")
public class NotificationModel {
    private String topic;
}
