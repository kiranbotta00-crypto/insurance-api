package com.freelance.insurance_api.controller;


import com.freelance.insurance_api.dto.CreatePolicyRequest;
import com.freelance.insurance_api.entity.Policy;
import com.freelance.insurance_api.service.PolicyService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
@AllArgsConstructor
public class PolicyController {

    private final PolicyService policyService;

    @PostMapping
    public Policy createPolicy(@Valid @RequestBody CreatePolicyRequest request){
        Policy policy = new Policy();
        policy.setPolicyNumber(request.policyNumber());
        policy.setCustomerName(request.customerName());
        policy.setPolicyType(request.policyType());
        policy.setPremium(request.premium());
        policy.setStatus(request.status());
        return policyService.createPolicy(policy);
    }

    @GetMapping("/{id}")
    public Policy getPolicy(@PathVariable Long id){
        return policyService.getPolicy(id);
    }

    @GetMapping
    public List<Policy> getAllPolicies(){
        return policyService.getAllPolicies();
    }

    @PutMapping("/{id}")
    public Policy updatepolicy(@PathVariable Long id, @RequestBody Policy policy){
        return policyService.updatePolicy(id,policy);
    }

    @DeleteMapping("/{id}")
    public void deletePolicy(@PathVariable Long id){
        policyService.deletePolicy(id);
    }
}
