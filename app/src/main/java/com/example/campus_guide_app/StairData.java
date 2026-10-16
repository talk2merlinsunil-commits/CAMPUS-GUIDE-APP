package com.example.campus_guide_app;
public class StairData {

    public static String getConnectorCorridor(
            String stairId,
            int floor) {

        if(stairId.equals("S1")) {

            switch(floor) {

                case 0:
                    return "C12";

                case 1:
                    return "C13";

                case 2:
                    return "C8";

                case 3:
                    return "C8";
            }
        }

        return null;
    }
}