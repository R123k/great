package com.example.rohit.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.io.IOException;
import java.util.ArrayList;

public class Booklist extends AppCompatActivity implements AdapterView.OnItemClickListener {

    SearchView v_search;
    DB_Helper db;
    ArrayList<String> listBook;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);

        v_search = findViewById(R.id.search);  // Search bar


        setContentView(R.layout.activity_booklist);
        listView = findViewById(R.id.listView);
        db= new DB_Helper(this);
        listBook = new ArrayList<>();
        fetchdata();



        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listBook);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }
    public void fetchdata() {
        db = new DB_Helper(this);
        try {
            db.createDataBase();
            db.opendatabase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        db.opendatabase();


        SQLiteDatabase database = db.getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM book", null);
        int i = cursor.getColumnIndex("bookname");
        listBook = new ArrayList<>();
        while (cursor.moveToNext()){
            String name = cursor.getString(i);
            listBook.add(name);
        }
        cursor.close();

    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(Booklist.this,BookDisplay.class);
        startActivity(intent);
    }
}
