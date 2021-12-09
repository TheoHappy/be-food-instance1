package com.rtg.foodbackend.repository;

import com.rtg.foodbackend.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food,String> {
}
