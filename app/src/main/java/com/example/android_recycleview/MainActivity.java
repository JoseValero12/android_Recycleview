package com.example.android_recycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_recycleview.adapter.FutbolistaAdapter;

import java.util.ArrayList;
import java.util.List;

import models.Futbolista;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(new Futbolista("Lionel Messi", "Delantero", "Argentina"));
        futbolistas.add(new Futbolista("Cristiano Ronaldo", "Delantero", "Portugal"));
        futbolistas.add(new Futbolista("Neymar Jr.", "Delantero", "Brasil"));
        futbolistas.add(new Futbolista("Luis Suárez", "Delantero", "Uruguay"));
        futbolistas.add(new Futbolista("Sergio Ramos", "Defensa", "España"));
        futbolistas.add(new Futbolista("Robert Lewandowski", "Delantero", "Polonia"));
        futbolistas.add(new Futbolista("Kylian Mbappé", "Delantero", "Francia"));
        futbolistas.add(new Futbolista("Luka Modrić", "Centrocampista", "Croacia"));


        FutbolistaAdapter adapter = new FutbolistaAdapter(futbolistas);

        RecyclerView recyclerView = findViewById(R.id.rvFutbolistas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
