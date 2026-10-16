package com.example.campus_guide_app;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

import java.util.ArrayList;
import java.util.List;

public class RoomDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_detail);
        ImageButton btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> finish());
        // Views
        PhotoView floorMap = findViewById(R.id.mapImage);
        RouteView routeView =
                findViewById(
                        R.id.routeView
                );
        View marker = findViewById(R.id.marker);
        View destinationMarker =
                findViewById(
                        R.id.destinationMarker
                );
        View connectorMarker =
                findViewById(
                        R.id.connectorMarker
                );
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TextView txtRoom = findViewById(R.id.txtRoomDetail);


        // Coordinate Picker (temporary)

        // Get data
        String roomNumber = getIntent().getStringExtra("room");
        String roomName = getIntent().getStringExtra("roomName");
        int floor = getIntent().getIntExtra("floor", 0);
        String currentRoomNumber =
                getIntent().getStringExtra(
                        "currentRoom"
                );
        floorMap.setOnPhotoTapListener((view, x, y) -> {

            int imageX = (int)(x * 4500);
            int imageY = (int)(y * 5601);

            txtRoom.setText(
                    roomName +
                            "\nRoom " + roomNumber +
                            "\n\nX = " + imageX +
                            "\nY = " + imageY
            );
        });
        txtRoom.setText(
                roomName +
                        "\nRoom " +
                        roomNumber
        );

        // Set floor map
        if (floor == 0) {
            floorMap.setImageResource(R.drawable.floor0);
        } else if (floor == 1) {
            floorMap.setImageResource(R.drawable.floor1);
        } else if (floor == 2) {
            floorMap.setImageResource(R.drawable.floor2);
        } else if (floor == 3) {
            floorMap.setImageResource(R.drawable.floor3);
        }

        // Find room
        Room room = RoomData.findRoom(roomNumber);
        Room currentRoom =
                RoomData.findRoom(
                        currentRoomNumber
                );
        CorridorPoint currentCorridor =
                null;

        CorridorPoint destinationCorridor =
                null;

        if (currentRoom != null) {

            currentCorridor =
                    findNearestCorridorPoint(
                            currentRoom
                    );
        }

        if (room != null) {

            destinationCorridor =
                    findNearestCorridorPoint(
                            room
                    );
        }
        if (
                currentCorridor != null
                        &&
                        destinationCorridor != null
        ) {

//            Toast.makeText(
//                    this,
//                    "Current Corridor = "
//                            + currentCorridor.getId()
//                            +
//                            "\nDestination Corridor = "
//                            + destinationCorridor.getId(),
//                    Toast.LENGTH_LONG
//            ).show();
            List<String> path =
                    PathFinder.findPath(
                            currentCorridor.getId(),
                            destinationCorridor.getId(),
                            room.getFloor()
                    );

//            Toast.makeText(
//                    this,
//                    path.toString(),
//                    Toast.LENGTH_LONG
//            ).show();
        }
        final Connector connector = null;

        if (room != null) {
            Toast.makeText(
                    this,
                    "Current=" +
                            currentRoomNumber +
                            "\nDestination=" +
                            roomNumber,
                    Toast.LENGTH_LONG
            ).show();
            final CorridorPoint finalCurrentCorridor =
                    currentCorridor;

            final CorridorPoint finalDestinationCorridor =
                    destinationCorridor;
            // Wait until image is laid out
            floorMap.post(() -> {

                if (currentRoom != null) {

                    updateMarkerPosition(
                            floorMap,
                            marker,
                            currentRoom.getX(),
                            currentRoom.getY()
                    );
//                    if (connector != null) {
//
//                        updateMarkerPosition(
//                                floorMap,
//                                connectorMarker,
//                                connector.getX(),
//                                connector.getY()
//                        );
//                    }

                    RectF rect = floorMap.getDisplayRect();

                    if (rect != null && currentRoom != null) {

                        float startX =
                                rect.left +
                                        (currentRoom.getX() / 4500f)
                                                * rect.width();

                        float startY =
                                rect.top +
                                        (currentRoom.getY() / 5601f)
                                                * rect.height();

                        float endX =
                                rect.left +
                                        (room.getX() / 4500f)
                                                * rect.width();

                        float endY =
                                rect.top +
                                        (room.getY() / 5601f)
                                                * rect.height();

                        List<String> path =
                                PathFinder.findPath(
                                        finalCurrentCorridor.getId(),
                                        finalDestinationCorridor.getId(),
                                        room.getFloor()
                                );

                        List<Float> points =
                                new ArrayList<>();

                        points.add(startX);
                        points.add(startY);

                        for (String corridorId : path) {

                            CorridorPoint corridor =
                                    getCorridorPoint(
                                            corridorId,
                                            room.getFloor()
                                    );

                            if (corridor != null) {

                                float corridorX =
                                        rect.left +
                                                (corridor.getX() / 4500f)
                                                        * rect.width();

                                float corridorY =
                                        rect.top +
                                                (corridor.getY() / 5601f)
                                                        * rect.height();

                                points.add(corridorX);
                                points.add(corridorY);
                            }
                        }

                        points.add(endX);
                        points.add(endY);

                        routeView.setRoute (points);

//                        if (connector != null) {
//
//                            float connectorX =
//                                    rect.left +
//                                            (connector.getX() / 4500f)
//                                                    * rect.width();
//
//                            float connectorY =
//                                    rect.top +
//                                            (connector.getY() / 5601f)
//                                                    * rect.height();
//
//                            points.add(connectorX);
//                            points.add(connectorY);
//                        }


                    }
                }


                updateMarkerPosition(
                        floorMap,
                        destinationMarker,
                        room.getX(),
                        room.getY()
                );;

                RectF rect = floorMap.getDisplayRect();

                if (rect != null) {

                    float displayedX =
                            rect.left + (room.getX() / 4500f) * rect.width();

                    float displayedY =
                            rect.top + (room.getY() / 5601f) * rect.height();

                    floorMap.setScale(
                            3.0f,
                            displayedX,
                            displayedY,
                            true
                    );
                }
            });
            // Update marker whenever map zooms/pans
            floorMap.setOnMatrixChangeListener(rect -> {

                if (currentRoom != null) {

                    updateMarkerPosition(
                            floorMap,
                            marker,
                            currentRoom.getX(),
                            currentRoom.getY()
                    );
//                    if (connector != null) {
//
//                        updateMarkerPosition(
//                                floorMap,
//                                connectorMarker,
//                                connector.getX(),
//                                connector.getY()
//                        );
//                    }
                }

                updateMarkerPosition(
                        floorMap,
                        destinationMarker,
                        room.getX(),
                        room.getY()
                );


                if (rect != null && currentRoom != null) {

                    float startX =
                            rect.left +
                                    (currentRoom.getX() / 4500f)
                                            * rect.width();

                    float startY =
                            rect.top +
                                    (currentRoom.getY() / 5601f)
                                            * rect.height();

                    float endX =
                            rect.left +
                                    (room.getX() / 4500f)
                                            * rect.width();

                    float endY =
                            rect.top +
                                    (room.getY() / 5601f)
                                            * rect.height();



//                    if (connector != null) {
//
//                        float connectorX =
//                                rect.left +
//                                        (connector.getX() / 4500f)
//                                                * rect.width();
//
//                        float connectorY =
//                                rect.top +
//                                        (connector.getY() / 5601f)
//                                                * rect.height();
//
//                        points.add(connectorX);
//                        points.add(connectorY);
//                    }

                    List<String> path =
                            PathFinder.findPath(
                                    finalCurrentCorridor.getId(),
                                    finalDestinationCorridor.getId(),
                                    room.getFloor()
                            );

                    List<Float> points =
                            new ArrayList<>();

                    points.add(startX);
                    points.add(startY);

                    for (String corridorId : path) {

                        CorridorPoint corridor =
                                getCorridorPoint(
                                        corridorId,
                                        room.getFloor()
                                );

                        if (corridor != null) {

                            float corridorX =
                                    rect.left +
                                            (corridor.getX() / 4500f)
                                                    * rect.width();

                            float corridorY =
                                    rect.top +
                                            (corridor.getY() / 5601f)
                                                    * rect.height();

                            points.add(corridorX);
                            points.add(corridorY);
                        }
                    }

                    points.add(endX);
                    points.add(endY);

                    routeView.setRoute(points);
                }
            });
        }
    }
    private Connector findBestConnector(
            Room current,
            Room destination
    ) {

        Connector best = null;

        double bestDistance = Double.MAX_VALUE;

        for (Connector connector :
                ConnectorData.getConnectors()) {

            if (connector.getFloor()
                    == current.getFloor()) {

                double distance =
                        Math.sqrt(
                                Math.pow(
                                        current.getX()
                                                - connector.getX(),
                                        2
                                )
                                        +
                                        Math.pow(
                                                current.getY()
                                                        - connector.getY(),
                                                2
                                        )
                        );

                if (distance < bestDistance) {

                    bestDistance = distance;
                    best = connector;
                }
            }
        }

        return best;
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
    private void updateMarkerPosition(
            PhotoView photoView,
            View marker,
            float imageX,
            float imageY
    ) {

        RectF rect = photoView.getDisplayRect();

        if (rect == null) return;

        float displayedX =
                rect.left + (imageX / 4500f) * rect.width();

        float displayedY =
                rect.top + (imageY / 5601f) * rect.height();

        marker.setX(
                displayedX - marker.getWidth() / 2f
        );

        marker.setY(
                displayedY - marker.getHeight() / 2f
        );
    }
}