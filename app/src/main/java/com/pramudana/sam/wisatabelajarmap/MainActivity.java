package com.pramudana.sam.wisatabelajarmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pramudana.sam.wisatabelajarmap.Model.Wisata;
import com.pramudana.sam.wisatabelajarmap.Model.WisataData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerWisata;
    CustomAdapter adapter;
    ArrayList<Wisata> tourism;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerWisata = findViewById(R.id.recyclerWisata);
        tourism = new ArrayList<>();
        tourism.addAll(WisataData.getWisataJogja());

        recyclerWisata.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter(tourism,MainActivity.this);
        recyclerWisata.setAdapter(adapter);
    }
}
