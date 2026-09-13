package com.freelance.insurance_api.repositry;

import com.freelance.insurance_api.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy,Long> {
}
