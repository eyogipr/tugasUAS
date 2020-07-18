package com.example.ramadhan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ramadhan.jadwalimsak.MainActivity_Jadwal_Imsak;
import com.example.ramadhan.jadwalsolat.MainSholat;
import com.example.ramadhan.kiblat.layout_kiblat;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn_kiblat;
    private Button btn_imsak;
    private Button btn_kajian;
    private Button btn_sholat;
    private Button btn_alquran;
    private Button btn_sholawat;
    private Button btn_doa;
    private Button btn_lain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_kiblat = (Button) findViewById(R.id.btn_kiblat);
        btn_kiblat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_layout_kiblat();
            }
        });

        btn_imsak = (Button) findViewById(R.id.btn_jadwal_imsak);
        btn_imsak.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openActivity_imsak();
            }
        });

        btn_kajian = (Button) findViewById(R.id.btn_kajian);
        btn_kajian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_kajian();
            }
        });

        btn_kajian = (Button) findViewById(R.id.btn_sholat);
        btn_kajian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_sholat();
            }
        });

        btn_alquran = (Button) findViewById(R.id.btn_alquran);
        btn_alquran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_alquran();
            }
        });

        btn_sholawat = (Button) findViewById(R.id.btn_sholawat);
        btn_sholawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_sholawat();
            }
        });

        btn_doa = (Button) findViewById(R.id.btn_doa);
        btn_doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_doa();
            }
        });

        btn_lain = (Button) findViewById(R.id.btn_lain);
        btn_lain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_lain();
            }
        });

    }

    public void openActivity_layout_kiblat(){
        Intent  intent = new Intent(this, layout_kiblat.class);
        startActivity(intent);
    }
    public void openActivity_imsak(){
        Intent intent = new Intent(this, MainActivity_Jadwal_Imsak.class);
        startActivity(intent);
    }

    public void openActivity_kajian(){
        Intent intent = new Intent(this, layout_kajian.class);
        startActivity(intent);
    }

    public void openActivity_sholat(){
        Intent intent = new Intent(this, MainSholat.class);
        startActivity(intent);
    }

    public void openActivity_alquran(){
        Intent intent = new Intent(this, alquran.class);
        startActivity(intent);
    }

    public void openActivity_sholawat(){
        Intent intent = new Intent(this, sholawat.class);
        startActivity(intent);
    }

    public void openActivity_doa(){
        Intent intent = new Intent(this, doa.class);
        startActivity(intent);
    }

    public void openActivity_lain(){
        Intent intent = new Intent(this, lain.class);
        startActivity(intent);
    }
}
