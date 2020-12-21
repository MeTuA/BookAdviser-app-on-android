package com.example.bookadviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookAdvisorActivity extends AppCompatActivity {
    private BookExpert expert = new BookExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_adviser);
    }

    public void onClickShowBooks(View view){
        TextView books = (TextView) findViewById(R.id.books);
        Spinner genre = (Spinner) findViewById(R.id.genres);
        String bookGenre = String.valueOf(genre.getSelectedItem());

        List<String> sel_books = expert.selectBooks(bookGenre);
        StringBuilder builder = new StringBuilder();
        for(String book:sel_books){
            builder.append(book).append("\n");
        }
        books.setText(builder);
    }
}