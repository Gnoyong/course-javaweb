package com.example.controller;


import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.Employee;
import com.example.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import static util.HttpUtils.success;

/**
 * (Employee)表控制层
 *
 * @author yong
 * @since 2023-12-07 19:56:06
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeeService employeeService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param employee 查询实体
     * @return 所有数据
     */
    @GetMapping
    public JSONObject selectAll(Page<Employee> page, Employee employee) {
        return success(this.employeeService.page(page, new QueryWrapper<>(employee)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public JSONObject selectOne(@PathVariable Serializable id) {
        return success(this.employeeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param employee 实体对象
     * @return 新增结果
     */
    @PostMapping
    public JSONObject insert(@RequestBody Employee employee) {
        employee.setLastDate(new Date());
        return success(this.employeeService.save(employee));
    }

    /**
     * 修改数据
     *
     * @param employee 实体对象
     * @return 修改结果
     */
    @PutMapping
    public JSONObject update(@RequestBody Employee employee) {
        return success(this.employeeService.updateById(employee));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public JSONObject delete(@RequestParam("idList") List<Long> idList) {
        return success(this.employeeService.removeByIds(idList));
    }
}

