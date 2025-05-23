package net.space.developer.springlocalstackawsintegration.common.annotations;


import org.springframework.stereotype.Component;

import java.lang.annotation.*;


/**
 * Custom @Component stereotype annotation
 *
 * @author Lazaro Noel Guerra Medina
 * @since 2025-05-23
 */

@Component
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomComponent {
}
