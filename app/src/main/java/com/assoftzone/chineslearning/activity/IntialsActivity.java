package com.assoftzone.chineslearning.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.assoftzone.chineslearning.R;
import com.assoftzone.chineslearning.fragment.RecyclerViewFragment;

public class IntialsActivity extends AppCompatActivity {
    //Declaring Array in Which Intials are Stored
    private static final String INTIALS_ARRAY[]={"b","p","m","f","d","t","n","l","g","k","h","j","q","x","z","c","s","zh","ch","sh","r","y","w"};
    private static final String FINAL_ARRAY[]={"b","dfg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intials_activty);
        MyAdapter mAdapter = new MyAdapter(getSupportFragmentManager());

        ViewPager mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

    }

    public static class MyAdapter extends FragmentStatePagerAdapter {
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
                RecyclerViewFragment.newInstance(INTIALS_ARRAY,"inti");
            }else if (position==1){
                RecyclerViewFragment.newInstance(FINAL_ARRAY,"final");
            }
            return null;
        }
    }

}
