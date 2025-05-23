package net.space.developer.springlocalstackawsintegration.common.annotations;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * Custom @Service stereotype annotation
 *
 * @author Lazaro Noel Guerra Medina
 * @since 2025-05-23
 */

@Service
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
}
