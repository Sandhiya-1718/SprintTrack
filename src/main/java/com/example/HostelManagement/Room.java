package com.example.HostelManagement;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;
    public Room(int roomNumber, String roomType)
    {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
    }
    public int getRoomNumber()
    {
        return roomNumber;
    }
    public String getRoomType()
    {
        return roomType;
    }
    public boolean getIsAvailable()
    {
        return isAvailable;
    }
    public void setIsAvailable(boolean isAvailable)
    {
        this.isAvailable=isAvailable;
    }
}
