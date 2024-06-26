package com.itmailian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itmailian.entity.OrderDetail;
import com.itmailian.mapper.OrderDetailMapper;
import com.itmailian.service.OrderDetailService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper,OrderDetail> implements OrderDetailService {
}
