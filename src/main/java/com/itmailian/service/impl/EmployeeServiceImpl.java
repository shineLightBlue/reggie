package com.itmailian.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itmailian.entity.Employee;
import com.itmailian.mapper.EmployeeMapper;
import com.itmailian.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
