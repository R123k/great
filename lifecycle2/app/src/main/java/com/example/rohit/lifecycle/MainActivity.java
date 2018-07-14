package com.example.rohit.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  Button t=(Button)findViewById(R.id.button);

        t.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
Toast t=Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG);
        t.show();
        }
    });

    protected void onStart(){
        Toast t =Toast.makeText(this,"activity process",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
    }

    protected void onResume() {
        Toast.makeText(this, "activity display", Toast.LENGTH_SHORT).show();
        t.setGravity(Gravity.CENTER);
    }

    protected void onStop()
        {
        Toast.makeText(this, "activity is stop", Toast.LENGTH_SHORT).show();
        t.setGravity(Gravity.CENTER);
    }

    protected void onPause()
        {
        Toast.makeText(this, "activity is not visible", Toast.LENGTH_SHORT).show();
        t.setGravity(Gravity.CENTER);
    }

    protected void onRestart() {
        Toast.makeText(this, "activity is restart", Toast.LENGTH_SHORT).show();
        t.setGravity(Gravity.CENTER);
    }

    protected void onDestroy() {
        Toast.makeText(this, "activity destroyed", Toast.LENGTH_SHORT).show();
        t.setGravity(Gravity.CENTER);
    }
}


