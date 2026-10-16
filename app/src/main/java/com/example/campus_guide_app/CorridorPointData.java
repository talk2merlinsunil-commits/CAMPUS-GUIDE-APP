package com.example.campus_guide_app;

import java.util.ArrayList;
import java.util.List;

public class CorridorPointData {

    public static List<CorridorPoint> getPoints(
            int floor
    ) {

        List<CorridorPoint> points =
                new ArrayList<>();

        if (floor == 0) {

            points.add(new CorridorPoint("C1",2300,3577,0));
            points.add(new CorridorPoint("C2",2296,3961,0));
            points.add(new CorridorPoint("C3",2428,3953,0));
            points.add(new CorridorPoint("C4",2433,4332,0));
            points.add(new CorridorPoint("C5",1959,4601,0));
            points.add(new CorridorPoint("C6",1959,4332,0));
            points.add(new CorridorPoint("C7",1651,4332,0));
            points.add(new CorridorPoint("C8",1312,4332,0));
            points.add(new CorridorPoint("C9",1312,3981,0));
            points.add(new CorridorPoint("C10",1526,3981,0));
            points.add(new CorridorPoint("C11",1526,3467,0));
            points.add(new CorridorPoint("C12",1526,3238,0));
            points.add(new CorridorPoint("C13",946,3238,0));
            points.add(new CorridorPoint("C14",1526,2880,0));
            points.add(new CorridorPoint("C15",1526,2501,0));
            points.add(new CorridorPoint("C16",925,2501,0));
            points.add(new CorridorPoint("C16A",1526,2799,0));
            points.add(new CorridorPoint("C17",1526,1772,0));
            points.add(new CorridorPoint("C18",918,1772,0));
            points.add(new CorridorPoint("C19",1526,1393,0));
            points.add(new CorridorPoint("C20",1526,1020,0));
            points.add(new CorridorPoint("C21",913,1020,0));
            points.add(new CorridorPoint("C22",2100,1020,0));
        }
        else if (floor == 1) {
            points.add(new CorridorPoint("C1",2213,3545,1));
            points.add(new CorridorPoint("C2",2213,3852,1));
            points.add(new CorridorPoint("C3",2213,4031,1));
            points.add(new CorridorPoint("C4",2277,4031,1));
            points.add(new CorridorPoint("C5",2277,4307,1));
            points.add(new CorridorPoint("C6",1819,4307,1));
            points.add(new CorridorPoint("C7",1308,4307,1));
            points.add(new CorridorPoint("C8",1018,4307,1));
            points.add(new CorridorPoint("C9",1308,3951,1));
            points.add(new CorridorPoint("C10",1006,3951,1));
            points.add(new CorridorPoint("C11",1457,3951,1));
            points.add(new CorridorPoint("C12",1457,3463,1));
            points.add(new CorridorPoint("C13",1457,3254,1));
            points.add(new CorridorPoint("C14",933,3254,1));
            points.add(new CorridorPoint("C15",1457,2815,1));
            points.add(new CorridorPoint("C16",1457,2498,1));
            points.add(new CorridorPoint("C17",943,2498,1));
            points.add(new CorridorPoint("C18",1457,2739,1));
            points.add(new CorridorPoint("C19",1457,1752,1));
            points.add(new CorridorPoint("C20",988,1752,1));
            points.add(new CorridorPoint("C21",1457,1307,1));
            points.add(new CorridorPoint("C22",1457,1023,1));
            points.add(new CorridorPoint("C23",1976,1023,1));
            points.add(new CorridorPoint("C24",923,1023,1));
        }
        else if (floor == 2 || floor == 3) {
            points.add(new CorridorPoint("C1", 2468, 3576, floor));
            points.add(new CorridorPoint("C2", 2480, 3969, floor));
            points.add(new CorridorPoint("C2A", 2395, 3965, floor));
            points.add(new CorridorPoint("C3", 2416, 4295, floor));
            points.add(new CorridorPoint("C3A", 2506, 4290, floor));
            points.add(new CorridorPoint("C4", 1460, 4273, floor));
            points.add(new CorridorPoint("C4A", 1992, 4301, floor));
            points.add(new CorridorPoint("C5", 1048, 4299, floor));
            points.add(new CorridorPoint("C6", 1554, 3943, floor));
            points.add(new CorridorPoint("C6A", 1446, 3940, floor));
            points.add(new CorridorPoint("C6B", 1006, 3912, floor));
            points.add(new CorridorPoint("C7", 1549, 3525, floor));
            points.add(new CorridorPoint("C7A", 1560, 3336, floor));
            points.add(new CorridorPoint("C8", 1531, 3226, floor));
            points.add(new CorridorPoint("C8A", 1539, 2856, floor));
            points.add(new CorridorPoint("C9", 931, 2463, floor));
            points.add(new CorridorPoint("C10", 1518, 1742, floor));
            points.add(new CorridorPoint("C10A", 1553, 1996, floor));
            points.add(new CorridorPoint("C11", 1001, 2467, floor));
            points.add(new CorridorPoint("C12", 1536, 1746, floor));
            points.add(new CorridorPoint("C13", 1031, 1735, floor));
            points.add(new CorridorPoint("C14", 1557, 1312, floor));
            points.add(new CorridorPoint("C15", 1538, 1022, floor));
            points.add(new CorridorPoint("C16", 2114, 1006, floor));
            points.add(new CorridorPoint("C17", 959, 1001, floor));
        }

        return points;
    }
    public static CorridorPoint getPoint(
            String id,
            int floor
    ) {

        for (CorridorPoint point : getPoints(floor)) {

            if (
                    point.getId().equals(id)
                            &&
                            point.getFloor() == floor
            ) {
                return point;
            }
        }

        return null;
    }
}