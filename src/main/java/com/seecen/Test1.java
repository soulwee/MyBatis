package com.seecen;

import com.seecen.dao.UserDao;
import com.seecen.entity.Student;
import com.seecen.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) throws IOException {
        InputStream in= Resources.getResourceAsStream("mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory=  new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //test
        /*   List<Student> l=sqlSession.selectList("com.seecen.entity.Student.queryAllStudent");
        for(Student s:l){
            System.out.println(s.getName());
        }*/
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        /*Map map=new HashMap<>();
        map.put("userName","111");
        map.put("password","password");
        userDao.addUser(map);
        sqlSession.commit();*/
        List<Integer> l=new ArrayList<Integer>();
        l.add(1);
        l.add(4);
        List<User> l2=userDao.queryUser(l);
        for(User u:l2){
            System.out.println(u.getUserName());
        }
    }

}
