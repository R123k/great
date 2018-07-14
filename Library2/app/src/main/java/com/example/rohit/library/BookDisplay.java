package com.example.rohit.library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BookDisplay extends AppCompatActivity {

    PDFView pdf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_display);

        pdf = (PDFView) findViewById(R.id.pdfView);
        pdf.fromAsset("Great Leader").load();
    }
}
