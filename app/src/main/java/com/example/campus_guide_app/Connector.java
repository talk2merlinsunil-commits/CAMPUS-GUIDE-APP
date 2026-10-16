package com.example.campus_guide_app;

public class Connector {

    private String name;
    private int floor;
    private float x;
    private float y;
    private String corridorId;
    private boolean lift;

    public Connector(
            String name,
            int floor,
            float x,
            float y,
            String corridorId,
            boolean lift
    ) {
        this.name = name;
        this.floor = floor;
        this.x = x;
        this.y = y;
        this.corridorId = corridorId;
        this.lift = lift;
    }

    public String getName() {
        return name;
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

    public String getCorridorId() {
        return corridorId;
    }

    public boolean isLift() {
        return lift;
    }
}