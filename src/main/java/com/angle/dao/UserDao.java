package com.angle.dao;

import com.angle.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> getAll();
    User getLogin(@Param("name") String name, @Param("age") String age);
}
