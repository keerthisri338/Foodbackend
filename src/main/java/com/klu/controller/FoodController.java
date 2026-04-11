package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.klu.model.Food;
import com.klu.service.FoodService;

@RestController
@RequestMapping("/food")
@CrossOrigin("*")   // IMPORTANT
public class FoodController {

    @Autowired
    private FoodService service;

    @PostMapping("/add")
    public Food addFood(@RequestBody Food food) {
        return service.addFood(food);
    }

    @GetMapping("/all")
    public List<Food> getAllFood() {
        return service.getAllFood();
    }
}