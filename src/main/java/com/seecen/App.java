package com.seecen;

import com.seecen.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        InputStream in=Resources.getResourceAsStream("mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory=  new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession();
      /*  User user=sqlSession.selectOne("com.seecen.entity.User.queryUserById",1);
        System.out.println(user.getUserName());*/
      /*  User user=new User();
        user.setUserId(1);
        user.setUserName("mybatis");
        user.setPassword("mybatis");
        sqlSession.update("com.seecen.entity.User.updateUser",user);*/
        sqlSession.delete("com.seecen.entity.User.deleteUser",21);
        sqlSession.commit();
    }
}
