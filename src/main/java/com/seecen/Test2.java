package com.seecen;

import com.seecen.dao.StudentDao;
import com.seecen.entity.Student;
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

public class Test2 {
    public static void main(String[] args) throws IOException {
        InputStream in= Resources.getResourceAsStream("mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory=  new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //test
        StudentDao studentDao=sqlSession.getMapper(StudentDao.class);
        //studentDao.insertStudent("pinkman","男");
        Map m=new HashMap();
        m.put("name","ee");
        m.put("sex","男");
        studentDao.insertStudentMap(m);
        sqlSession.commit();
     /*   for(Student s:studentDao.queryAllStudent()){
            System.out.println(s.getName());
        }
*/
        List<Integer> l=new ArrayList<Integer>();
        l.add(1);
        l.add(4);
        for(Student s:studentDao.queryStudentList(l)){
            System.out.println("name:"+s.getName());
        }
    }
}
