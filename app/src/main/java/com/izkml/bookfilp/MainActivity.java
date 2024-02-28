package com.izkml.bookfilp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.izkml.bookfilp.adapter.PagerAdapter;
import com.izkml.bookfilp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.vp.setAdapter(pagerAdapter = new PagerAdapter(this));


    }
}