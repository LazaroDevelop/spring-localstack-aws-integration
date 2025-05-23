package net.space.developer.springlocalstackawsintegration.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.space.developer.springlocalstackawsintegration.common.annotations.CustomComponent;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@CustomComponent
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "info")
public class NotificationModel {
    private String topic;
}
