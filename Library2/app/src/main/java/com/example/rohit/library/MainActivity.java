package com.example.rohit.library;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    DB_Helper db;
    ArrayList<String> Listcaste;
    LinkedHashMap<String, List<String>> Listitem;
    ExpandableListAdapter adapter;
    ExpandableListView expandableListView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView = (ExpandableListView) findViewById(R.id.ExpandListView);
        button = (Button) findViewById(R.id.button);
        db = new DB_Helper(this);
        Listcaste = new ArrayList<>();
        fetchall();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(HomeActivity.this, Booklist.class);
                startActivity(in);
            }

        });
    }
}