package com.itmailian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmailian.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
