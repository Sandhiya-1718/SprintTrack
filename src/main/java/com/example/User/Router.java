package com.example.User;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class Router {

    List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getAllUser()
    {
        return users;
    }

    @PostMapping
    public User createUser(@RequestBody User u)
    {
        users.add(u);
        return u;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id)
    {
        for(User d:users)
        {
            if(d.getId() == id)
                return d;
        }
        return null;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User u)
    {
        for(User d:users)
        {
            if(d.getId() == id)
            {
                d.setName(u.getName());
                d.setEmail(u.getEmail());
                d.setPassword(u.getPassword());
                return d;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id)
    {
        for(User d:users)
        {
            if(d.getId() == id)
            {
                users.remove(d);
                return "User deleted";
            }
        }
        return "User not found";
    }
}
