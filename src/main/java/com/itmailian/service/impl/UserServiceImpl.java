package com.itmailian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itmailian.entity.User;
import com.itmailian.mapper.UserMapper;
import com.itmailian.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
