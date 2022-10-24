package com.example.ltcyazilim.operator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ltcyazilim.R;
import com.example.ltcyazilim.databinding.ActivityKullaniciGirisBinding;
import com.example.ltcyazilim.databinding.ActivityQrKontrolBinding;

public class QrKontrolActivity extends AppCompatActivity {

    private ActivityQrKontrolBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityQrKontrolBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonYanlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(QrKontrolActivity.this,QrActivity.class);
                startActivity(intent);
            }
        });

        binding.buttonDogru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(QrKontrolActivity.this,OperatorKontrolActivity.class);
                startActivity(intent);
            }
        });

    }
}