package com.amazing_apps.ray.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        display_main();
    }

    public void display_main()
    {
        setContentView(R.layout.activity_main);
    }
}
