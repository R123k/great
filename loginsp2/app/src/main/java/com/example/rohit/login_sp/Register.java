package com.example.rohit.login_sp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final EditText username=(EditText)findViewById(R.id.etnewname);
        final EditText password=(EditText)findViewById(R.id.etnewpassword);
        final EditText email=(EditText)findViewById(R.id.etnewemail);
        Button btnREgister=(Button)findViewById(R.id.etnewregister);
    btnREgister.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            SharedPreferences preferences=getSharedPreferences("MYPREFS",MODE_PRIVATE);
            String newuser=username.getText().toString();
            String newpassword=password.getText().toString();
            String newEmail=email.getText().toString();


            SharedPreferences.Editor editor =preferences.edit();

            editor.putString(newuser + newpassword + "data",newuser +"/n" + newEmail);
            editor.commit();

            Intent loginScreen=new Intent(Register.this, MainActivity.class);
            startActivity(loginScreen);


        }
    });
    }
}
