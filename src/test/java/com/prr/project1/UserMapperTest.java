package com.prr.project1;

import com.prr.project1.entity.User;
import com.prr.project1.mapper.UserMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author prr
 * @title: UserMapperTest
 * @projectName project1
 * @description: TODO
 * @date 2021/11/25 13 : 18
 */
@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    @DisplayName("插入数据")
    public void testInsert() {
        User user = new User("test1", "t123", "test1", "男", "test1@qq.com", "18218585906", "ssss",
                new java.sql.Timestamp(System.currentTimeMillis()));
        Integer id = userMapper.insert(user);
        System.out.printf(id.toString());
    }

    @Test
    @DisplayName("根据id查找")
    public void testSelectById() {
        User user = userMapper.selectById(1);
        System.out.println(user.toString());
    }

    @Test
    @DisplayName("查找所有")
    public void testSelectAll() {
        List userList = userMapper.selectObjs(null);
        System.out.println(userList.size());
    }

    @Test
    @DisplayName("更新")
    public void testUpdate() {
        User user = new User();
        user.setId(1);
        user.setAddress("金葫芦镇");
        Integer id = userMapper.updateById(user);
        System.out.println(id);
    }

    @Test
    @DisplayName("删除")
    public void testDelete() {
        userMapper.deleteById(1);
    }

}
