package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.EmployeeDao;
import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * (Employee)表服务实现类
 *
 * @author yong
 * @since 2023-12-07 19:56:11
 */
@Service("employeeService")
public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao, Employee> implements EmployeeService {

}

