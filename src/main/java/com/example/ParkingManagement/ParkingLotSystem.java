package com.example.ParkingManagement;

import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/parking")
public class ParkingLotSystem {

    List<Vehicle> parking = new ArrayList<>();
    List<Vehicle> waiting = new ArrayList<>();
    private int slots = 10;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");

    @PostMapping
    public String entry(@RequestBody Vehicle v)
    {
        if(parking.size() < slots)
        {
            v.setEntryTime(LocalTime.now());
            parking.add(v);
            return "Vehicle " + v.getVehicleNumber() + " entered at " + v.getEntryTime().format(dtf);
        }
        else
        {
            waiting.add(v);
            return "Parking is full. "+v.getVehicleNumber() + "added to waiting list.";
        }
    }

    @PostMapping("/exit/{vehicleNumber}")
    public String exit(@PathVariable String vehicleNumber)
    {
        for(int i = 0 ; i < parking.size() ; i++)
        {
            Vehicle v = parking.get(i);
            if(v.getVehicleNumber().equalsIgnoreCase(vehicleNumber))
            {
                v.setExitTime(LocalTime.now());
                parking.remove(v);
                Duration d = Duration.between(v.getEntryTime(),v.getExitTime());
                long mins = d.toMinutes();
                String msg = "Vehicle " + v.getVehicleNumber() + " stayed from " + v.getEntryTime().format(dtf) + " to " + v.getExitTime().format(dtf) + ". Total: " + mins + " mins.";
                if(!waiting.isEmpty())
                {
                    Vehicle next = waiting.remove(0);
                    next.setEntryTime(LocalTime.now());
                    parking.add(next);
                    msg += "/nNext vehicle " + next.getVehicleNumber() + " moved from waiting list.";
                }
                return msg;
            }
        }
        return "Vehicle not found.";
    }

    @GetMapping("/status")
    public Map<String,Object> getStatus()
    {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("Total Slots", slots);
        map.put("Occupied", parking.size());
        map.put("Available", slots - parking.size());
        map.put("In Lot", parking.stream().map(Vehicle::getVehicleNumber).toArray());
        map.put("Waiting", waiting.stream().map(Vehicle::getVehicleNumber).toArray());
        return map;
    }
}
