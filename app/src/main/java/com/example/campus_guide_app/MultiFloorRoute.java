package com.example.campus_guide_app;

public class MultiFloorRoute {

    public int floor;
    public String startNode;
    public String endNode;

    public MultiFloorRoute(
            int floor,
            String startNode,
            String endNode) {

        this.floor = floor;
        this.startNode = startNode;
        this.endNode = endNode;
    }
}