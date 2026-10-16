package com.example.campus_guide_app;

public class StairConnector {

    public String id;
    public int floor;
    public String corridor;

    public StairConnector(
            String id,
            int floor,
            String corridor) {

        this.id = id;
        this.floor = floor;
        this.corridor = corridor;
    }
}