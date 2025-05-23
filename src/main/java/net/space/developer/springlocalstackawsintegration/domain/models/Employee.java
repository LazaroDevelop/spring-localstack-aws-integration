package net.space.developer.springlocalstackawsintegration.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Employee model class to define an employee attributes
 *
 * @author Lazaro Noel Guerra Medina
 * @since 2025-05-23
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private BigDecimal salary;
}
