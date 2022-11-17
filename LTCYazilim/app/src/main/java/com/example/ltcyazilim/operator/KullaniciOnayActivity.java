package com.example.ltcyazilim.operator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;

import com.example.ltcyazilim.R;
import com.example.ltcyazilim.databinding.ActivityKullaniciOnayBinding;

public class KullaniciOnayActivity extends AppCompatActivity {

    private ActivityKullaniciOnayBinding girisBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        girisBinding = DataBindingUtil.setContentView(this,R.layout.activity_kullanici_onay);
        String name= getIntent().getStringExtra("name");
        girisBinding.textViewGirisSaglandi.setText("Hoşgeldiniz"+name);

    }
}