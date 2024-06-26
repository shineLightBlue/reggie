package com.itmailian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmailian.dto.SetmealDto;
import com.itmailian.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    void saveWithDish(SetmealDto setmealDto);

    void removeWithDish(List<Long> ids);
}
