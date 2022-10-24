package com.example.ltcyazilim.operator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ltcyazilim.R;
import com.example.ltcyazilim.databinding.ActivityKullaniciGirisBinding;
import com.example.ltcyazilim.databinding.ActivityQrBinding;

public class KullaniciGirisActivity extends AppCompatActivity {

    private ActivityKullaniciGirisBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityKullaniciGirisBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.butonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),QrActivity.class));
            }
        });

    }
}