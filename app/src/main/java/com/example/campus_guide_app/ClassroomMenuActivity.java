package com.example.campus_guide_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ClassroomMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_classroom_menu);
        ImageButton btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> finish());
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Button btnFloor0 = findViewById(R.id.btnFloor0);
        Button btnFloor1 = findViewById(R.id.btnFloor1);
        Button btnFloor2 = findViewById(R.id.btnFloor2);
        Button btnFloor3 = findViewById(R.id.btnFloor3);

        btnFloor0.setOnClickListener(v -> {
            Intent intent = new Intent(ClassroomMenuActivity.this, ClassroomActivity.class);
            intent.putExtra("floor", 0);
            startActivity(intent);
        });

        btnFloor1.setOnClickListener(v -> {
            Intent intent = new Intent(ClassroomMenuActivity.this, ClassroomActivity.class);
            intent.putExtra("floor", 1);
            startActivity(intent);
        });
        btnFloor2.setOnClickListener(v -> {
            Intent intent = new Intent(ClassroomMenuActivity.this, ClassroomActivity.class);
            intent.putExtra("floor", 2);
            startActivity(intent);
        });
        btnFloor3.setOnClickListener(v -> {
            Intent intent = new Intent(ClassroomMenuActivity.this, ClassroomActivity.class);
            intent.putExtra("floor", 3);
            startActivity(intent);
        });
        };
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    }
