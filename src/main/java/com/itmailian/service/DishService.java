package com.itmailian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmailian.dto.DishDto;
import com.itmailian.entity.Dish;

public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);
    public DishDto getByIdWithFlavor(Long id);
    public void updateWithFlavor(DishDto dishDto);
}
