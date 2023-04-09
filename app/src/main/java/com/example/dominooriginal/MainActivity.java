package com.example.dominooriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView btnPindah, btnPindahThird;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindah = findViewById(R.id.menu);
        btnPindahThird = findViewById(R.id.halaman_ketiga);

        //        PINDAH HALAMAN
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(itn);
            }
        });

        btnPindahThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(itn);
            }
        });
    }
}