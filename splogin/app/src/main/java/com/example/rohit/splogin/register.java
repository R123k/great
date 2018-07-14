package com.example.rohit.splogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final TextView name=(TextView)findViewById(R.id.et1);
        final EditText password=(EditText)findViewById(R.id.et2);
        final  EditText Email=(EditText)findViewById(R.id.et3);
        Button btn1register=(EditText)findViewById(R.id.buttonReg);



    }
}
