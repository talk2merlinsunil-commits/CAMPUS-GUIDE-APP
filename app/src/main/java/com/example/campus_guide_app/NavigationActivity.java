package com.example.campus_guide_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        TextView txtCurrentLocation =
                findViewById(R.id.txtCurrentLocation);

        EditText edtDestination =
                findViewById(R.id.edtDestination);

        Button btnNavigate =
                findViewById(R.id.btnNavigate);

        TextView txtRoute =
                findViewById(R.id.txtRoute);

        String roomNumber =
                getIntent().getStringExtra("roomNumber");

        Room room =
                RoomData.findRoom(roomNumber);

        if (room != null) {

            txtCurrentLocation.setText(
                    "Current Location\n\n" +
                            room.getRoomName() +
                            "\nRoom " +
                            room.getRoomNumber() +
                            "\nFloor " +
                            room.getFloor()
            );

        }

        btnNavigate.setOnClickListener(v -> {

            String destinationNumber =
                    edtDestination.getText().toString().trim();

            Room destination =
                    RoomData.findRoom(destinationNumber);

            if (destination == null) {

                txtRoute.setText("Room not found");
                return;
            }

            Connector connector =
                    findBestConnector(
                            room,
                            destination
                    );

            if (room.getFloor() == destination.getFloor()) {

                txtRoute.setText(
                        "Current Location:\n" +
                                room.getRoomName() +

                                "\n\nDestination:\n" +
                                destination.getRoomName() +

                                "\n\nRoute:\n" +
                                "Destination is on Floor " +
                                destination.getFloor() +
                                ". Follow corridor signs to Room " +
                                destination.getRoomNumber()
                );

            } else {

                String connectorName =
                        connector != null
                                ? connector.getName()
                                : "nearest staircase";

                txtRoute.setText(
                        "Current Location:\n" +
                                room.getRoomName() +

                                "\n\nDestination:\n" +
                                destination.getRoomName() +

                                "\n\nRoute:\n" +
                                "Go to " +
                                connectorName +
                                ".\n" +
                                "Move to Floor " +
                                destination.getFloor() +
                                ".\n" +
                                "Proceed to Room " +
                                destination.getRoomNumber()
                );
            }

            Intent intent;

            if (room.getFloor()
                    == destination.getFloor()) {

                intent =
                        new Intent(
                                NavigationActivity.this,
                                RoomDetailActivity.class
                        );

            } else {

                intent =
                        new Intent(
                                NavigationActivity.this,
                                MultiFloorNavigationActivity.class
                        );
            }
            intent.putExtra(
                    "currentRoom",
                    room.getRoomNumber()
            );

            intent.putExtra(
                    "room",
                    destination.getRoomNumber()
            );

            intent.putExtra(
                    "roomName",
                    destination.getRoomName()
            );

            intent.putExtra(
                    "floor",
                    destination.getFloor()
            );


            startActivity(intent);
        });
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

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}