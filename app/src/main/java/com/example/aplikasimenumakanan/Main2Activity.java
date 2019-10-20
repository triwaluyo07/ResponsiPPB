package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView myNama, myDesc, myHarga;
    ImageView myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myNama = (TextView) findViewById(R.id.DetNama);
        myDesc = (TextView) findViewById(R.id.DetDesc);
        myHarga = (TextView) findViewById(R.id.DetHrg);
        myImage = (ImageView) findViewById(R.id.gambarMakanan);

        //get data from makananAdapter
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String[] mydata = extras.getStringArray("MYDATA");
            myNama.setText(mydata[0]);
            myDesc.setText(mydata[1]);
            myHarga.setText(mydata[2]);

            myImage.setImageResource(getResources().getIdentifier(mydata[3], "drawable", getPackageName()));
        }
    }
}
