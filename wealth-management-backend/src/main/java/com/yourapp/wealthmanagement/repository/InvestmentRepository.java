package com.yourapp.wealthmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yourapp.wealthmanagement.model.Investment;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}
