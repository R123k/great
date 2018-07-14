package com.example.rohit.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.PrivateKey;

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

            }
        });
    }

    protected void onCreate() {

        Toast.makeText(this, "create activity", Toast.LENGTH_SHORT).show();
t.setGravity(Gravity.CENTER);
    }

    protected void onCstart() {
        Toast.makeText(this, "activity process", Toast.LENGTH_SHORT).show();
        t.setGravity(Gravity.CENTER);
    }

    protected void onresume() {
        Toast.makeText(this, "activity display", Toast.LENGTH_SHORT).show();
        t.setGravity(Gravity.CENTER);
    }

    protected void onstop() {
        Toast.makeText(this, "activity is stop", Toast.LENGTH_SHORT).show();
        t.setGravity(Gravity.CENTER);
    }

    protected void onpause() {
        Toast.makeText(this, "activity is not visible", Toast.LENGTH_SHORT).show();
        t.setGravity(Gravity.CENTER);
    }

    protected void onrestart() {
        Toast.makeText(this, "activity is restart", Toast.LENGTH_SHORT).show();
        t.setGravity(Gravity.CENTER);
    }

    protected void ondestroy() {
        Toast.makeText(this, "activity destroyed", Toast.LENGTH_SHORT).show();
        t.setGravity(Gravity.CENTER);
    }
}
