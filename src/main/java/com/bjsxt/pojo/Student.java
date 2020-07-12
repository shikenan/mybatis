package com.bjsxt.pojo;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer sid;
    private Integer tid;
    private String stName;
    private Integer stAge;
    private Teacher teacher;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", tid=" + tid +
                ", stName='" + stName + '\'' +
                ", stAge=" + stAge +
                ", teacher=" + teacher +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public Integer getStAge() {
        return stAge;
    }

    public void setStAge(Integer stAge) {
        this.stAge = stAge;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student() {
    }

    public Student(Integer sid, Integer tid, String stName, Integer stAge, Teacher teacher) {
        this.sid = sid;
        this.tid = tid;
        this.stName = stName;
        this.stAge = stAge;
        this.teacher = teacher;
    }
}
