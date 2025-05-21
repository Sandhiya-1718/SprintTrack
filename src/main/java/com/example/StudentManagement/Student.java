package com.example.StudentManagement;

public class Student {
    private int rollno;
    private String name;
    private int marks;

    Student(int rollno, String name, int marks)
    {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    public int getRollno()
    {
        return rollno;
    }
    public String getName()
    {
        return name;
    }
    public int getMarks()
    {
        return marks;
    }
    public void setMarks(int marks)
    {
        this.marks = marks;
    }
}
