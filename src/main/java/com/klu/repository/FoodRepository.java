package com.klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klu.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
