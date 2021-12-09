package com.rtg.foodbackend.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FoodDTO {
    private String name;
    private int proteins;
    private int carbohydrates;
    private int fats;
}
