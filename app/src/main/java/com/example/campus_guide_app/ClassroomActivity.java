package com.example.campus_guide_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ClassroomActivity extends AppCompatActivity {

    ArrayList<Room> rooms;
    RoomAdapter adapter;       // global

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_classroom);
        ImageButton btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> finish());
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        TextView txtNoResults = findViewById(R.id.txtNoResults);
        RecyclerView recyclerView = findViewById(R.id.recyclerViewRooms);
        EditText searchBar = findViewById(R.id.searchBar);

        int floor = getIntent().getIntExtra("floor", 1);

        rooms = RoomData.getRoomsForFloor(floor);

        adapter = new RoomAdapter(rooms);

        adapter.setOnItemClickListener(new RoomAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Room room) {

                Intent intent = new Intent(
                        ClassroomActivity.this,
                        RoomDetailActivity.class
                );

                intent.putExtra("room", room.getRoomNumber());
                intent.putExtra("roomName", room.getRoomName());
                intent.putExtra("floor", room.getFloor());

                startActivity(intent);
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // ✅ SEARCH LOGIC
        searchBar.addTextChangedListener(new android.text.TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterRooms(s.toString(), txtNoResults);
            }

            @Override
            public void afterTextChanged(android.text.Editable s) {}
        });
    }

    // ✅ FILTER FUNCTION (OUTSIDE onCreate)
    private void filterRooms(String text, TextView txtNoResults) {

        ArrayList<Room> filteredList = new ArrayList<>();

        for (Room room : rooms) {

            if (
                    room.getRoomNumber().toLowerCase().contains(text.toLowerCase())
                            ||
                            room.getRoomName().toLowerCase().contains(text.toLowerCase())
            ) {
                filteredList.add(room);
            }
        }

        adapter.updateList(filteredList);

        if (filteredList.isEmpty()) {
            txtNoResults.setVisibility(View.VISIBLE);
        } else {
            txtNoResults.setVisibility(View.GONE);
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}