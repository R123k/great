package com.example.rohit.login_sp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.RegionIterator;
import android.net.nsd.NsdManager;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etname=(EditText)findViewById(R.id.etnewname);
        final EditText etpassword=(EditText)findViewById(R.id.etpassword);
        Button btnLogin=(Button)findViewById(R.id.etlogin);
        Button btnRegister=(Button)findViewById(R.id.etregister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=etname.getText().toString();
                String password=etpassword.getText().toString();

                SharedPreferences preferences=getSharedPreferences("MYPREFS",MODE_PRIVATE);

                String userDetails=preferences.getString(user + password + "data","username or password is incorrect");
                SharedPreferences.Editor editor=preferences.edit();
                editor.putString("display",userDetails);
                editor.commit();


                Intent displayscreen=new Intent(MainActivity.this, ContactsContract.DisplayNameSources.class);
                startActivity(displayscreen);
                }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerScreen=new Intent(MainActivity.this, RegionIterator.class);
                startActivity(registerScreen);
                }
        });

    }
}
