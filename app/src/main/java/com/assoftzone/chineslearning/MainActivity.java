package com.assoftzone.chineslearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.assoftzone.chineslearning.activity.ChooseLevel;

/**
 * Created by Somia on 1/18/2018.
 */

public class MainActivity extends AppCompatActivity {

    Button selectLanguage;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_language);

        selectLanguage = (Button) findViewById(R.id.ChineseFromEnglishButton);
        //When Button Pressed Moved To Next Activity
        selectLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EnglishLanguageActivity();
            }
        });
    }
        //Switching to Choose Level Activity
        public void EnglishLanguageActivity()
        {
            Intent intent = new Intent(this, ChooseLevel.class);
            startActivity(intent);
        }

    }

