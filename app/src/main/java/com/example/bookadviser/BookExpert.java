package com.example.bookadviser;


import java.util.List;
import java.util.ArrayList;
public class BookExpert {
    public List<String> selectBooks(String genre){
        List<String> books = new ArrayList<>();
        if(genre.equals("Horror")){
            books.add("It,Steven King");
            books.add("Frankenstein, Mary Wollstonecraft Shelley");
        }
        if(genre.equals("Fantasy")){
            books.add("Adventure to center of Earth");
            books.add("Harry Potter");
        }
        if(genre.equals("Science")){
            books.add("Tesla");
            books.add("Math5");
        }

        return books;
    }
}
