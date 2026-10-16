package com.example.campus_guide_app;

public class Room {

    private String roomNumber;
    private String roomName;
    private int floor;
    private float x;
    private float y;
    public Room(String roomNumber, String roomName, int floor,float x,float y) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.floor = floor;
        this.x=x;
        this.y=y;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getFloor() {
        return floor;
    }
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}