package com.example.rohit.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username,password;
Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       EditText username =(EditText)findViewById(R.id.ed1);
        password =(EditText)findViewById(R.id.ed2);
        b =(Button)findViewById(R.id.button);
    }
    public void movepage(View v)
    {
        String stusername=username.getText().toString();
        String stpassword=password.getText().toString();

        if(stusername.equals("Rohit") && stpassword.equals("8814061621"))

        {
            Intent i=new Intent(MainActivity.this,login2.class);
            Bundle bundle=new Bundle();
            bundle.putString("username",stusername);
            startActivity(i);
            bundle.putString("key",stpassword);
            i.putExtra(bundle);
            }
        else if(stusername.equals("") || stpassword.equals(""))
        {
            Toast.makeText(getApplicationContext(),"ENTER BOTH NAME AND PASSWORD",Toast.LENGTH_SHORT);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"WRONG NAME AND PASSWORD",Toast.LENGTH_SHORT);
        }
    }
}
