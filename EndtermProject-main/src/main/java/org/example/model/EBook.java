package org.example.model;

public class EBook implements Book {
    @Override
    public String getInfo() { // getType емес, getInfo болуы керек
        return "Электронды кітап (PDF)";
    }
}