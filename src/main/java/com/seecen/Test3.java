package com.seecen;

import com.seecen.entity.Course;
import com.seecen.entity.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws IOException {
        InputStream in= Resources.getResourceAsStream("mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory=  new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //test
        List<Teacher> l=sqlSession.selectList("com.seecen.entity.Teacher.queryCourse","%叶%");
        for(Teacher c:l){
            System.out.println(c.getTeacherName()+"\t");
            List<Course> list=c.getCourseList();
            for(Course course:list){
                System.out.println(course.getCourseName());
            }
        }

    }
}

