package com.rtg.foodbackend.mapper;

import com.rtg.foodbackend.dto.FoodDTO;
import com.rtg.foodbackend.model.Food;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public Food convertDtoToModel(FoodDTO foodDTO) {
        return Food.builder()
                .name(foodDTO.getName())
                .proteins(foodDTO.getProteins())
                .fats(foodDTO.getFats())
                .carbohydrates(foodDTO.getCarbohydrates())
                .build();
    }

    public FoodDTO convertModelToDto(Food food) {
        return FoodDTO.builder()
                .name(food.getName())
                .carbohydrates(food.getCarbohydrates())
                .fats(food.getFats())
                .proteins(food.getProteins())
                .build();
    }
}
