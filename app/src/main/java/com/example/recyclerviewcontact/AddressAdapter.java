package com.example.recyclerviewcontact;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.AddressHolder> {
    String[] addressData = {};
    private LayoutInflater layoutInflater;

    AddressAdapter(String[] _data) {
        addressData = _data;
    }

    @NonNull
    @Override
    public AddressHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.address_item, parent, false);
        return new AddressHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddressHolder holder, int position) {
        String title = addressData[position];
        holder.title.setText(title);

    }

    @Override
    public int getItemCount() {
        return addressData.length;
    }

    public class AddressHolder extends RecyclerView.ViewHolder {
ImageView imgIcon;
TextView title;
        public AddressHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            title = itemView.findViewById(R.id.title);
        }
    }
}
