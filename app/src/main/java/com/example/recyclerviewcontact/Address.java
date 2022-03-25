package com.example.recyclerviewcontact;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Address extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private String[] addresses={"Shopokova 11","Lenina 21","Togtogula 18","Griboedova 123"};
    private View listItemView;
    public static Address newInstance(){
        return new Address();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        listItemView = inflater.inflate(R.layout.fragment_main,container,false);
        recyclerView = listItemView.findViewById(R.id.addressesList);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter= new AddressAdapter(addresses);
        recyclerView.setAdapter(adapter);
        return listItemView ;
    }
}
