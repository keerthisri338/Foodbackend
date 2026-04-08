package com.klu.service;

import com.klu.model.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {

    List<Food> list = new ArrayList<>();

    public String addFood(Food food) {
        list.add(food);
        return "Food Added Successfully";
    }

    public List<Food> getAllFood() {
        return list;
    }
}