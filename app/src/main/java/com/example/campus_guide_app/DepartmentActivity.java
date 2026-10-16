package com.example.campus_guide_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DepartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_department);
        ImageButton btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> finish());
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Button btnEEE = findViewById(R.id.btnEEE);
        Button btnCE = findViewById(R.id.btnCE);
        Button btnME = findViewById(R.id.btnME);
        Button btnAE = findViewById(R.id.btnAE);
        Button btnISE = findViewById(R.id.btnISE);
        Button btnCS = findViewById(R.id.btnCS);
        Button btnMBA = findViewById(R.id.btnMBA);
        Button btnTC = findViewById(R.id.btnTC);
        Button btnEC = findViewById(R.id.btnEC);

        btnEEE.setOnClickListener(v -> openDepartment("Electrical and Electronics Engineering"));
        btnCE.setOnClickListener(v -> openDepartment("Civil Engineering"));
        btnME.setOnClickListener(v -> openDepartment("Mechanical Engineering"));
        btnAE.setOnClickListener(v -> openDepartment("Aeronautical Engineering"));
        btnISE.setOnClickListener(v -> openDepartment("Information Science Engineering"));
        btnCS.setOnClickListener(v -> openDepartment("Computer Science Engineering"));
        btnMBA.setOnClickListener(v -> openDepartment("MBA"));
        btnTC.setOnClickListener(v -> openDepartment("Telecommunication Engineering"));
        btnEC.setOnClickListener(v -> openDepartment("Electronics Communication"));
    }

    // ✅ OUTSIDE onCreate()
    private void openDepartment(String dept) {
        Intent intent = new Intent(DepartmentActivity.this, DepartmentDetailActivity.class);
        intent.putExtra("department", dept);
        startActivity(intent);
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}