package com.bjsxt.mapper;

import com.bjsxt.pojo.Student;
import com.bjsxt.pojo.Teacher;
import com.bjsxt.pojo.Template;
import com.bjsxt.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface UserMapper {

    List<Teacher> selectTea();

    List<Student> selectStu(int tid);
    List<Student> select1(Student student);
    List<Student> select2(Student student);

    int delete1(Student student);
    int insert1(Student student, Date date);

    int update1(@Param("student") Student student);
    List<Student> selectAll();
    int insert2(Student student);







}
