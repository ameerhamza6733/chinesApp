package com.assoftzone.chineslearning.activity;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.assoftzone.chineslearning.R;
import com.assoftzone.chineslearning.fragment.RecyclerViewIntialsFragment;
import com.assoftzone.chineslearning.fragment.RecylerviewFinalFragment;

public class IntialsActivity extends AppCompatActivity {


    private static final String TAG = "IntialsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intials_activty);
        MyAdapter mAdapter = new MyAdapter(getSupportFragmentManager());
        ViewPager mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

    }

    public  class MyAdapter extends FragmentStatePagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public Fragment getItem(int position) {

            if (position==0){
               return new RecyclerViewIntialsFragment();
            }else if (position==1){

                return new RecylerviewFinalFragment();
            }
            return null;
        }
    }

}
