package com.freelance.insurance_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record CreatePolicyRequest(

        @NotBlank
        String policyNumber,
        @NotBlank
        String customerName,
        @NotBlank
        String policyType,
        @NotNull
        @Positive
        Double premium,
        @NotBlank
        String status
) {
}
