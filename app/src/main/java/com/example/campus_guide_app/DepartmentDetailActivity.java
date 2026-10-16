package com.example.campus_guide_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DepartmentDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_detail);
        ImageButton btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> finish());
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // ✅ STEP 4: Get department name
        TextView txtDeptName = findViewById(R.id.txtDeptName);
        String department = getIntent().getStringExtra("department");
        txtDeptName.setText(department);

        // ✅ STEP 5: Buttons
        Button btnClassrooms = findViewById(R.id.btnClassrooms);
        Button btnLabs = findViewById(R.id.btnLabs);
        Button btnStaff = findViewById(R.id.btnStaff);

        btnClassrooms.setOnClickListener(v ->
                Toast.makeText(this, "Classrooms coming soon", Toast.LENGTH_SHORT).show());

        btnLabs.setOnClickListener(v ->
                Toast.makeText(this, "Labs coming soon", Toast.LENGTH_SHORT).show());

        btnStaff.setOnClickListener(v ->
                Toast.makeText(this, "Staff room coming soon", Toast.LENGTH_SHORT).show());
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}