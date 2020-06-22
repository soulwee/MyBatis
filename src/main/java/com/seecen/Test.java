package com.seecen;

import com.seecen.dao.UserDao;
import com.seecen.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream in= Resources.getResourceAsStream("mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory=  new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //test
        UserDao userDao=sqlSession.getMapper(UserDao.class);
/*        User user=userDao.queryUserById(1);
        System.out.println(user.getUserName());*/
    }
    public void test() throws IOException {
        InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();


    }
}

