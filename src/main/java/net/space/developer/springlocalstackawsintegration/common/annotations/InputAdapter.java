package net.space.developer.springlocalstackawsintegration.common.annotations;

import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

/**
 * Custom @RestController stereotype annotation
 *
 * @author Lazaro Noel Guerra Medina
 * @since 2025-05-23
 */

@Documented
@RestController
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface InputAdapter {}
