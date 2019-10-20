package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    makananAdapter adapter;
    ArrayList<makanan> makananArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        adapter = new makananAdapter(MainActivity.this,makananArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    void addData()
    {
        makananArrayList = new ArrayList<>();

        makananArrayList.add(
                new makanan(
                        1,
                        "Pecel Lele",
                        "15000",
                        "gambar1",
                        "Pecel lele adalah lele yang dipecel"

                )
        );
        makananArrayList.add(
                new makanan(
                        2,
                        "Nasi goreng mercon",
                        "14500",
                        "gambar2",
                        "Nasi Goreng mercon adalah  nasi goreng yang dikasih mercon"
                )
        );
        makananArrayList.add(
                new makanan(
                        3,
                        "Ayam geprek keju",
                        "20000",
                        "gambar3",
                        "Ayam geprek tapi keju dipisah"
                )
        );
        makananArrayList.add(
                new makanan(
                        4,
                        "Kari ayam",
                        "17500",
                        "gambar4",
                        "Hei makan dulu sanaaa"
        ));
        makananArrayList.add(
                new makanan(
                        5,
                        "Tahu Bulat",
                        "500",
                        "gambar5",
                        "Digoreng dadakan , buru buru soalnya"
                ));
        makananArrayList.add(
                new makanan(
                        6,
                        "Salad buah",
                        "12000",
                        "gambar6",
                        "Temennya salad sayur"
        ));
    }
}
