package com.practice.designPattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private final List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        //read all employees from database and put into the list
        empList.add("Leonard");
        empList.add("Raj");
        empList.add("Sheldon");
        empList.add("Howard");
    }

    public List<String> getEmpList() {
        return empList;
    }

    //with this there is no need to load data from the database all over again
    @Override
    public Object clone() {
        List<String> temp = new ArrayList<>(this.getEmpList());
        return new Employees(temp);
    }
}
