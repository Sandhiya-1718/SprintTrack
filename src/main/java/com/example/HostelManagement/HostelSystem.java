package com.example.HostelManagement;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hostel")
public class HostelSystem {

    List<Student> students=new ArrayList<>();
    List<Room> rooms=new ArrayList<>();

    @PostMapping("/student")
    public Student registerStudent(@RequestBody Student s)
    {
        students.add(s);
        return s;
    }

    @PostMapping("/room")
    public Room addRoom(@RequestParam int roomNumber,@RequestParam String roomType)
    {
        Room r = new Room(roomNumber,roomType);
        rooms.add(r);
        return r;
    }

    @PutMapping("/allocate")
    public Student allocateRoom(@RequestParam String name)
    {
        for(Student s:students)
        {
            if(s.getName().equalsIgnoreCase((name)))
            {
                for(Room r:rooms)
                {
                    if(s.getRoomPreference().equalsIgnoreCase(r.getRoomType()) && r.getIsAvailable())
                    {
                        s.setAllocated(r.getRoomNumber());
                        r.setIsAvailable(false);
                        return s;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @DeleteMapping("/vacate")
    public String vacateStudent(@RequestParam String name)
    {
        for(Student s:students)
        {
            if(s.getName().equalsIgnoreCase(name))
            {
                for(Room r:rooms)
                {
                    if(s.getAllocated() == r.getRoomNumber())
                    {
                        r.setIsAvailable(true);
                        break;
                    }
                }
                students.remove(s);
                return name + " vacated";
            }
        }
        return "No student found with name " + name;
    }

    @GetMapping("/students")
    public List<Student> displayStudents()
    {
        return students;
    }

    @GetMapping("/rooms")
    public List<Room> displayRooms()
    {
        return rooms;
    }
}
