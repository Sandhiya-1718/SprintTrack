package com.example.ParkingManagement;

import java.time.LocalTime;

public class Vehicle {
    private String vehicleNumber;
    private LocalTime entryTime;
    private LocalTime exitTime;

    Vehicle(String vehicleNumber)
    {
        this.vehicleNumber = vehicleNumber;
        this.entryTime = LocalTime.now();
    }
    public LocalTime getEntryTime()
    {
        return entryTime;
    }
    public void setEntryTime(LocalTime entryTime)
    {
        this.entryTime = entryTime;
    }
    public String getVehicleNumber()
    {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber)
    {
        this.vehicleNumber = vehicleNumber;
    }
    public LocalTime getExitTime()
    {
        return exitTime;
    }
    public void setExitTime(LocalTime exitTime)
    {
        this.exitTime = exitTime;
    }
}
