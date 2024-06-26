package com.itmailian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itmailian.entity.Orders;

public interface OrderService extends IService<Orders> {
    public void submit(Orders orders);
}
