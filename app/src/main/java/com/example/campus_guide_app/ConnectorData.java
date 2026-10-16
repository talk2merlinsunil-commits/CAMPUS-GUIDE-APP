package com.example.campus_guide_app;

import java.util.ArrayList;
import java.util.List;

public class ConnectorData {

    public static List<Connector> getConnectors() {

        List<Connector> connectors =
                new ArrayList<>();

        // ==========================
        // Stair A (Common all floors)
        // ==========================

        connectors.add(new Connector(
                "STAIR_A",0,
                1431,3125,
                "C12",
                false));

        connectors.add(new Connector(
                "STAIR_A",1,
                1352,3137,
                "C13",
                false));

        connectors.add(new Connector(
                "STAIR_A",2,
                1408,3085,
                "C8",
                false));

        connectors.add(new Connector(
                "STAIR_A",3,
                1408,3085,
                "C8",
                false));

        // ==========================
        // Stair B
        // ==========================

        connectors.add(new Connector(
                "STAIR_B",0,
                1421,2385,
                "C15",
                false));

        connectors.add(new Connector(
                "STAIR_B",1,
                1369,2385,
                "C16",
                false));

        connectors.add(new Connector(
                "STAIR_B",2,
                1439,2365,
                "C10",
                false));

        connectors.add(new Connector(
                "STAIR_B",3,
                1439,2365,
                "C10",
                false));

        // ==========================
        // Stair C
        // ==========================

        connectors.add(new Connector(
                "STAIR_C",0,
                1407,1647,
                "C17",
                false));

        connectors.add(new Connector(
                "STAIR_C",1,
                1371,1647,
                "C19",
                false));

        connectors.add(new Connector(
                "STAIR_C",2,
                1426,1650,
                "C12",
                false));

        connectors.add(new Connector(
                "STAIR_C",3,
                1426,1650,
                "C12",
                false));

        // ==========================
        // Stair D
        // ==========================

        connectors.add(new Connector(
                "STAIR_D",0,
                1606,865,
                "C20",
                false));

        connectors.add(new Connector(
                "STAIR_D",1,
                1520,849,
                "C22",
                false));

        connectors.add(new Connector(
                "STAIR_D",2,
                1623,859,
                "C15",
                false));

        connectors.add(new Connector(
                "STAIR_D",3,
                1623,859,
                "C15",
                false));

        // ==========================
        // Stair E (1,2,3 only)
        // ==========================

        connectors.add(new Connector(
                "STAIR_E",1,
                2121,3957,
                "C3",
                false));

        connectors.add(new Connector(
                "STAIR_E",2,
                2290,3917,
                "C2A",
                false));

        connectors.add(new Connector(
                "STAIR_E",3,
                2290,3917,
                "C2A",
                false));

        // ==========================
        // Stair F (1,2,3 only)
        // ==========================

        connectors.add(new Connector(
                "STAIR_F",1,
                1543,3909,
                "C11",
                false));

        connectors.add(new Connector(
                "STAIR_F",2,
                1624,3929,
                "C6",
                false));

        connectors.add(new Connector(
                "STAIR_F",3,
                1624,3929,
                "C6",
                false));

        return connectors;
    }
    public static Connector getConnector(
            String name,
            int floor
    ) {

        for (Connector connector :
                getConnectors()) {

            if (connector.getName().equals(name)
                    && connector.getFloor() == floor) {

                return connector;
            }
        }

        return null;
    }
    public static List<Connector> getConnectorsForFloor(
            int floor
    ) {

        List<Connector> result =
                new ArrayList<>();

        for (Connector connector :
                getConnectors()) {

            if (connector.getFloor() == floor) {
                result.add(connector);
            }
        }

        return result;
    }

}