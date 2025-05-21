package com.example.StudentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentSystem {

    List<Student> students = new ArrayList<>();

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student s)
    {
        students.add(s);
        return s;
    }

    @GetMapping
    public List<Student> displayStudent()
    {
        return students;
    }

    @GetMapping("/search")
    public Student searchStudent(@RequestParam(required = false) String name, @RequestParam(required = false) Integer rollno)
    {
        for(Student s:students)
        {
            if(name != null && s.getName().equalsIgnoreCase(name))
                return s;
            if(rollno != null && s.getRollno() == rollno)
                return s;
        }
        return null;
    }

    @PutMapping("/update/{rollno}")
    public Student updateMarks(@PathVariable int rollno, @RequestParam int marks)
    {
        for(Student s:students)
        {
            if(s.getRollno() == rollno)
            {
                s.setMarks(marks);
                return s;
            }
        }
        return null;
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam int rollno)
    {
        for(Student s:students)
        {
            if(s.getRollno() == rollno)
            {
                students.remove(s);
                return rollno + " deleted";
            }
        }
        return "No student found with rollno " + rollno;
    }
}
