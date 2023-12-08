package com.example.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * (Employee)表实体类
 *
 * @author yong
 * @since 2023-12-07 19:56:10
 */
@Data
public class Employee {

    private Integer id;

    private String username;

    private String fullName;

    private Integer gender;

    private Integer position;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date entryDate;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date lastDate;

    private Integer departmentId;
}

