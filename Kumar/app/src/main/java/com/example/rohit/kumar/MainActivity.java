package com.example.rohit.kumar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import static android.view.Gravity.CENTER;
import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast t=Toast.makeText(getApplication(),"Rohit", LENGTH_LONG);
        t.setGravity(CENTER,0,0);
        t.show();
    }
}
