package com.example.campus_guide_app;
import android.net.Uri;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        String qrResult = getIntent().getStringExtra("qr_result");

        if (qrResult != null) {

            String roomNumber = qrResult.replace("Room:", "").trim();

            Room room = RoomData.findRoom(roomNumber);

            if (room != null) {

                Toast.makeText(
                        this,
                        room.getRoomName() +
                                "\nRoom " +
                                room.getRoomNumber(),
                        Toast.LENGTH_LONG
                ).show();
            }
        }
        Button btnClassroom=findViewById(R.id.btnRooms);
        Button btnDepartments=findViewById(R.id.btnDepartments);

        Button btnMap=findViewById(R.id.btnMap);
        Button btnQRcode=findViewById(R.id.btnQRcode);

        btnClassroom.setOnClickListener (v -> {

            Intent intent= new Intent(MainActivity.this,ClassroomMenuActivity.class);
            startActivity(intent);
        });

        btnDepartments.setOnClickListener (v -> {

            Intent intent = new Intent(MainActivity.this, DepartmentActivity.class);
            startActivity(intent);
        });


        btnMap.setOnClickListener(v -> {

            Uri gmmIntentUri =
                    Uri.parse("google.streetview:cbll=12.98358,77.76215");

            Intent mapIntent =
                    new Intent(Intent.ACTION_VIEW, gmmIntentUri);

            mapIntent.setPackage("com.google.android.apps.maps");

            startActivity(mapIntent);

        });
        btnQRcode.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity.this,
                            QRScannerActivity.class
                    );

            startActivity(intent);
        });

        }
    }
