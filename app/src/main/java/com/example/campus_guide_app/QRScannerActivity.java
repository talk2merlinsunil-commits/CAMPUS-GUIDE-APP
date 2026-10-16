package com.example.campus_guide_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class QRScannerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setPrompt("");
        integrator.setBeepEnabled(true);
        integrator.setOrientationLocked(true);
        integrator.initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode,
                                    int resultCode,
                                    Intent data) {

        IntentResult result =
                IntentIntegrator.parseActivityResult(
                        requestCode,
                        resultCode,
                        data
                );

        if (result != null) {

            if (result.getContents() != null) {
                CurrentLocation.currentRoom =
                        result.getContents();
                String roomNumber =
                        result.getContents()
                                .replace("Room:", "")
                                .trim();

                Intent intent = new Intent(
                        QRScannerActivity.this,
                        NavigationActivity.class
                );

                intent.putExtra(
                        "roomNumber",
                        roomNumber
                );


                intent.putExtra(
                        "qr_result",
                        result.getContents()
                );

                Toast.makeText(
                        this,
                        result.getContents(),
                        Toast.LENGTH_LONG
                ).show();

                startActivity(intent);
                finish();
            }
        }

        super.onActivityResult(
                requestCode,
                resultCode,
                data
        );
    }

}