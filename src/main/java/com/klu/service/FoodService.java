package com.klu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.klu.model.Food;
import com.klu.repository.FoodRepository;

@Service
public class FoodService {

    @Autowired
    private FoodRepository repo;

    public Food addFood(Food food) {
        return repo.save(food);
    }

    public List<Food> getAllFood() {
        return repo.findAll();
    }
}