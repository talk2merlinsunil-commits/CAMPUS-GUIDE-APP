package com.example.campus_guide_app;

public class CorridorPoint {

    private String id;
    private float x;
    private float y;
    private int floor;

    public CorridorPoint(
            String id,
            float x,
            float y,
            int floor
    ) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.floor = floor;
    }

    public String getId() {
        return id;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getFloor() {
        return floor;
    }
}