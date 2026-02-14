package org.example.patterns;
import org.example.model.*; // model ішіндегі Book-ты тану үшін керек
public class BookFactory {
    public static Book createBook(String type) {
        if (type.equalsIgnoreCase("EBOOK")) return new EBook();
        if (type.equalsIgnoreCase("PRINTED")) return new PrintedBook();
        return null;
    }
}