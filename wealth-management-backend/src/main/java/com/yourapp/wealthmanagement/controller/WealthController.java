package com.yourapp.wealthmanagement.controller;

import com.yourapp.wealthmanagement.model.User;
import com.yourapp.wealthmanagement.model.Investment;
import com.yourapp.wealthmanagement.service.WealthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wealth")
public class WealthController {

    @Autowired
    private WealthService wealthService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return wealthService.getAllUsers();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return wealthService.createUser(user);
    }

    @PostMapping("/users/{userId}/investments")
    public Investment addInvestment(@PathVariable Long userId, @RequestBody Investment investment) {
        return wealthService.addInvestment(userId, investment);
    }

    @GetMapping("/users/{userId}/investments")
    public List<Investment> getUserInvestments(@PathVariable Long userId) {
        return wealthService.getUserInvestments(userId);
    }
}
