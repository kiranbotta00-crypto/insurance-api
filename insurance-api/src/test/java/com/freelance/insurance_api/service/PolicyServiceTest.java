package com.freelance.insurance_api.service;

import com.freelance.insurance_api.entity.Policy;
import com.freelance.insurance_api.repositry.PolicyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PolicyServiceTest {

    @Mock
    private PolicyRepository policyRepository;
    @InjectMocks
    private PolicyService policyService;

    @Test
    void createPolicy_shouldSavepolicy() {
        Policy policy= new Policy();
        policyRepository.save(policy);
        verify(policyRepository).save(policy);
    }

    @Test
    void createPolicy_shouldSavepolicyNull() {

        when(policyRepository.findById(999L)).thenReturn(Optional.empty());
        Policy result = policyService.getPolicy(999L);
        assertNull(result);
    }
}