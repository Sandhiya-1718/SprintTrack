package com.example.HostelManagement;

public class Student{
    private int id;
    private String name;
    private char gender;
    private int age;
    private String roomPreference;
    private int allocated;
    private static int counter = 1;
    public Student(String name, char gender, int age, String roomPreference)
    {
        this.id = counter++;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.roomPreference = roomPreference;
        this.allocated = -1;
    }
    public String getName()
    {
        return name;
    }
    public char getGender()
    {
        return gender;
    }
    public int getAge()
    {
        return age;
    }
    public String getRoomPreference()
    {
        return roomPreference;
    }
    public int getAllocated()
    {
        return allocated;
    }
    public void setAllocated(int allocated)
    {
        this.allocated=allocated;
    }
}
