package com.izkml.bookfilp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.izkml.bookfilp.adapter.PagerAdapter;
import com.izkml.bookfilp.anim.SimulationPageAnim;
import com.izkml.bookfilp.databinding.ActivityMainBinding;
import com.izkml.bookfilp.view.BookFlipView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bookFlip.setTouchListener(new BookFlipView.TouchListener() {
            @Override
            public boolean onTouch() {
                return true;
            }

            @Override
            public void center() {

            }

            @Override
            public void prePage() {
            }

            @Override
            public void nextPage() {
            }

            @Override
            public void cancel() {
            }
        });


    }
}