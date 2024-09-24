package com.yourapp.wealthmanagement.service;

import com.yourapp.wealthmanagement.model.User;
import com.yourapp.wealthmanagement.model.Investment;
import com.yourapp.wealthmanagement.repository.UserRepository;
import com.yourapp.wealthmanagement.repository.InvestmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WealthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private InvestmentRepository investmentRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Investment addInvestment(Long userId, Investment investment) {
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new RuntimeException("User not found"));
        investment.setUser(user);
        return investmentRepository.save(investment);
    }

    public List<Investment> getUserInvestments(Long userId) {
        return investmentRepository.findByUserId(userId);
    }
}
