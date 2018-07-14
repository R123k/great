package com.example.rohit.login_sp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rohit.login_sp.R;

public class Displayscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info);

        SharedPreferences preferences=getSharedPreferences("MYPREF",MODE_PRIVATE);
        String display=preferences.getString("display","");

        EditText displayinfo =(EditText) findViewById(R.id.textviewname);
        EditText Email=(EditText)findViewById(R.id.editText);
        displayinfo.setText(display);

    }
}
