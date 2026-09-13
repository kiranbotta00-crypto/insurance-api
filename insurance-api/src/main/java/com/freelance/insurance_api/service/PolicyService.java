package com.freelance.insurance_api.service;

import com.freelance.insurance_api.entity.Policy;
import com.freelance.insurance_api.exception.PolicyNotFoundException;
import com.freelance.insurance_api.repositry.PolicyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PolicyService {

    private final PolicyRepository policyRepository;


    public Policy createPolicy(Policy policy){

        return policyRepository.save(policy);
    }

    public Policy getPolicy(Long id){
        return policyRepository.findById(id).orElse(null);
    }

    public List<Policy> getAllPolicies(){
        return policyRepository.findAll();
    }

    public Policy updatePolicy(Long id,Policy policy){
        Policy existinpolicy = policyRepository.findById(id).orElse(null);
        if(existinpolicy==null){
            return null;
        }
        existinpolicy.setPolicyNumber(policy.getPolicyNumber());
        existinpolicy.setCustomerName(policy.getCustomerName());
        existinpolicy.setPolicyType(policy.getPolicyType());
        existinpolicy.setPremium(policy.getPremium());
        existinpolicy.setStatus(policy.getStatus());
        return policyRepository.save(existinpolicy);
    }

    public void deletePolicy(Long id){
        Policy policy = policyRepository.findById(id).orElseThrow(() -> new PolicyNotFoundException("Policy not found with id: " + id));
        policyRepository.delete(policy);
    }

}
