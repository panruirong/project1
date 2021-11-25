package com.prr.project1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;


/**
 * @author prr
 * @title: User
 * @projectName project1
 * @description: 用户实体
 * @date 2021/11/25 12:27
 */
@TableName(value = "user")
@Data
public class User {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String loginName;
    private String loginPwd;
    private String userName;
    private String sex;
    private String email;
    private String phone;
    private String address;
    private Timestamp createTime;

    public User(String loginName, String loginPwd, String userName, String sex, String email, String phone,
                String address, Timestamp createTime) {
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.userName = userName;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.createTime = createTime;
    }

    public User() {
    }
}
