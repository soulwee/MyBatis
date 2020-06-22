package com.seecen.dao;

import com.seecen.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public List<Student> queryAllStudent();
    //
    public void insertStudent(String name,String sex);

    public void insertStudentMap(Map map);

    public List<Student> queryStudentList(List<Integer> idList);
}
