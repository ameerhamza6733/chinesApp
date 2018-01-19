package com.assoftzone.chineslearning.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.assoftzone.chineslearning.R;


public class ChooseLevel extends AppCompatActivity {

    Button Introduction;
    Button Dictionary;
    Button Lessons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_level);

        Introduction = (Button) findViewById(R.id.IntroductionPinyinButton);
        Dictionary = (Button) findViewById(R.id.DictionaryButton);
        Lessons = (Button) findViewById(R.id.LessonsButton);

        //When Button Pressed Moved To Next Activity Pinyin Introduction
        Introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IntroductionPinyinActivity();
            }
        });
    }
    //Switching to Introduction Activity
    public void IntroductionPinyinActivity()
    {
        Intent intent = new Intent(this, ActivityEnglish.class);
        startActivity(intent);
    }
        }
