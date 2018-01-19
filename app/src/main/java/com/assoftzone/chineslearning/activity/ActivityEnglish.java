package com.assoftzone.chineslearning.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.assoftzone.chineslearning.R;
import com.assoftzone.chineslearning.adapters.CustomPagerAdapter;


/**
 * Created by Somia on 1/18/2018.
 */

public class ActivityEnglish extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager_adapter);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));
    }
}