package com.example.campus_guide_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.ViewHolder> {

    // 🔹 Click listener
    public interface OnItemClickListener {
        void onItemClick(Room room);    }

    private OnItemClickListener clickListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.clickListener = listener;
    }

    // 🔹 Data change listener (for "No results")
    public interface OnDataChangedListener {
        void onDataChanged(int size);
    }

    private OnDataChangedListener dataListener;

    public void setOnDataChangedListener(OnDataChangedListener listener) {
        this.dataListener = listener;
    }

    // 🔹 Data
    private ArrayList<Room> roomsList;

    public RoomAdapter(ArrayList<Room> rooms) {
        this.roomsList = new ArrayList<>(rooms);
    }

    // 🔹 ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtRoom;

        public ViewHolder(View itemView) {
            super(itemView);
            txtRoom = itemView.findViewById(R.id.txtRoom);

            itemView.setOnClickListener(v -> {
                if (clickListener != null) {
                    clickListener.onItemClick(roomsList.get(getAdapterPosition()));
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_room, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Room room = roomsList.get(position);

        holder.txtRoom.setText(
                room.getRoomName() +
                        "\nRoom " +
                        room.getRoomNumber()
        );
    }

    @Override
    public int getItemCount() {
        return roomsList.size();
    }

    // 🔥 UPDATE LIST (USED BY SEARCH)
    public void updateList(ArrayList<Room> newList) {
        roomsList = new ArrayList<>(newList);
        notifyDataSetChanged();

        if (dataListener != null) {
            dataListener.onDataChanged(roomsList.size());
        }
    }
}