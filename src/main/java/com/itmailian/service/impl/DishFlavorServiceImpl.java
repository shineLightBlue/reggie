package com.itmailian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itmailian.entity.DishFlavor;
import com.itmailian.mapper.DishFlavorMapper;
import com.itmailian.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
