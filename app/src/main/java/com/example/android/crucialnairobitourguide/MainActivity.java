package com.example.android.crucialnairobitourguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);

        fragmentPageAdapter adapter = new fragmentPageAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }
}
