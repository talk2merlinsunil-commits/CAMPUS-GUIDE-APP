package com.example.campus_guide_app;

import android.graphics.RectF;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

import java.util.ArrayList;
import java.util.List;

public class MultiFloorNavigationActivity
        extends AppCompatActivity {
    private int currentDisplayedFloor;
    private PhotoView floorMap;
    private RouteView routeView;
    private TextView txtFloor;
    private Button btnNextFloor;
    private Room currentRoom;
    private Room destinationRoom;
    @Override
    protected void onCreate(
            Bundle savedInstanceState
    ) {
        super.onCreate(savedInstanceState);

        setContentView(
                R.layout.activity_multi_floor_navigation
        );
        floorMap =
                findViewById(R.id.floorMap);

        routeView =
                findViewById(R.id.routeView);

        txtFloor =
                findViewById(R.id.txtFloor);

        btnNextFloor =
                findViewById(R.id.btnNextFloor);
        String currentRoomNumber =
                getIntent().getStringExtra(
                        "currentRoom"
                );

        String destinationRoomNumber =
                getIntent().getStringExtra(
                        "room"
                );

         currentRoom =
                RoomData.findRoom(
                        currentRoomNumber
                );

        destinationRoom =
                RoomData.findRoom(
                        destinationRoomNumber
                );
        final int[] currentFloor = {
                currentRoom.getFloor()
        };

        loadFloorMap(currentFloor[0]);
        floorMap.setOnMatrixChangeListener(rect -> {

            drawFloorRoute(
                    currentDisplayedFloor
            );

        });

        btnNextFloor.setOnClickListener(v -> {

            if (currentRoom.getFloor()
                    < destinationRoom.getFloor()) {

                currentFloor[0]++;

                if (currentFloor[0]
                        > destinationRoom.getFloor()) {

                    finish();
                    return;
                }

            } else {

                currentFloor[0]--;

                if (currentFloor[0]
                        < destinationRoom.getFloor()) {

                    finish();
                    return;
                }
            }

            loadFloorMap(currentFloor[0]);
            if(currentFloor[0]
                    == destinationRoom.getFloor()) {

                btnNextFloor.setText(
                        "Destination Floor"
                );
            }
            else {

                btnNextFloor.setText(
                        "Next Floor"
                );
            }
        });

    }
    private void loadFloorMap(
            int floor
    ) {
        currentDisplayedFloor = floor;
        txtFloor.setText(
                "Floor " + floor
        );

        if (floor == 0) {

            floorMap.setImageResource(
                    R.drawable.floor0
            );

        }

        else if (floor == 1) {

            floorMap.setImageResource(
                    R.drawable.floor1
            );

        }

        else if (floor == 2) {

            floorMap.setImageResource(
                    R.drawable.floor2
            );

        }

        else if (floor == 3) {

            floorMap.setImageResource(
                    R.drawable.floor3
            );
        }
         {

             drawFloorRoute(floor);
        }
    }

    private void drawFloorRoute(
            int floor
    ) {

        floorMap.post(() -> {

            List<Float> points =
                    new ArrayList<>();

            CorridorPoint startCorridor =
                    findNearestCorridorPoint(
                            currentRoom
                    );

            CorridorPoint endCorridor =
                    findNearestCorridorPoint(
                            destinationRoom
                    );

            if (startCorridor == null
                    || endCorridor == null) {
                return;
            }

            List<String> path =
                    PathFinder.findPath(
                            startCorridor.getId(),
                            endCorridor.getId(),
                            floor
                    );

            RectF rect =
                    floorMap.getDisplayRect();

            if (rect == null) {
                return;
            }

            for (String corridorId : path) {

                CorridorPoint corridor =
                        getCorridorPoint(
                                corridorId,
                                floor
                        );

                if (corridor != null) {

                    float x =
                            rect.left +
                                    (corridor.getX() / 4500f)
                                            * rect.width();

                    float y =
                            rect.top +
                                    (corridor.getY() / 5601f)
                                            * rect.height();

                    points.add(x);
                    points.add(y);
                }
            }

            routeView.setRoute(points);

        });
    }
    private CorridorPoint getCorridorPoint(
            String id,
            int floor
    ) {

        for (
                CorridorPoint point :
                CorridorPointData.getPoints(
                        floor
                )
        ) {

            if (
                    point.getId().equals(id)
            ) {

                return point;
            }
        }

        return null;
    }
    private CorridorPoint findNearestCorridorPoint(
            Room room
    ) {

        CorridorPoint nearest = null;

        double shortestDistance =
                Double.MAX_VALUE;

        for (
                CorridorPoint point :
                CorridorPointData.getPoints(
                        room.getFloor()
                )
        ) {

            double distance =
                    Math.sqrt(
                            Math.pow(
                                    room.getX()
                                            - point.getX(),
                                    2
                            )
                                    +
                                    Math.pow(
                                            room.getY()
                                                    - point.getY(),
                                            2
                                    )
                    );

            if (distance < shortestDistance) {

                shortestDistance = distance;
                nearest = point;
            }
        }

        return nearest;
    }
    private Connector getNearestConnector(
            int floor
    ) {

        Connector nearest = null;

        double shortestDistance =
                Double.MAX_VALUE;

        for (Connector connector :
                ConnectorData.getConnectors()) {

            if (connector.getFloor() == floor) {

                double distance =
                        Math.sqrt(
                                Math.pow(
                                        currentRoom.getX()
                                                - connector.getX(),
                                        2
                                )
                                        +
                                        Math.pow(
                                                currentRoom.getY()
                                                        - connector.getY(),
                                                2
                                        )
                        );

                if (distance < shortestDistance) {

                    shortestDistance = distance;
                    nearest = connector;
                }
            }
        }

        return nearest;
    }
}