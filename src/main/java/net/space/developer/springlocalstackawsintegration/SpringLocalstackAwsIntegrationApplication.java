package net.space.developer.springlocalstackawsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties
public class SpringLocalstackAwsIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLocalstackAwsIntegrationApplication.class, args);
    }

}
