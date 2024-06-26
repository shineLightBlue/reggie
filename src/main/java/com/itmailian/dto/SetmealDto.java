package com.itmailian.dto;

import com.itmailian.entity.Setmeal;
import com.itmailian.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {
    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
