package com.bjsxt.pojo;

import java.io.Serializable;
import java.util.List;

public class Teacher implements Serializable {
    private Integer tid;
    private String tName;
    private Integer tAge;
    private List<Student> list;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tName='" + tName + '\'' +
                ", tAge=" + tAge +
                ", list=" + list +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public Teacher() {
    }

    public Teacher(Integer tid, String tName, Integer tAge, List<Student> list) {
        this.tid = tid;
        this.tName = tName;
        this.tAge = tAge;
        this.list = list;
    }
}
