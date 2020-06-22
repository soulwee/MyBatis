package com.seecen.dao;

import com.seecen.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {
    public void addUser(Map map);
    public List<User> queryUser(List<Integer> list);
    /*@Select("select * from tb_user where userid=#{userId}")
    public User queryUserById(int userId);*/


}
