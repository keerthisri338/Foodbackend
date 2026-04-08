package com.klu.controller;

import com.klu.model.Food;
import com.klu.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/food")
public class FoodController {

    @Autowired
    FoodService service;

    @PostMapping("/add")
    public String addFood(@RequestBody Food food) {
        return service.addFood(food);
    }

    @GetMapping("/all")
    public List<Food> getAllFood() {
        return service.getAllFood();
    }
}