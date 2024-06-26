package com.itmailian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itmailian.entity.ShoppingCart;
import com.itmailian.mapper.ShoppingCartMapper;
import com.itmailian.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
