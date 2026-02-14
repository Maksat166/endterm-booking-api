package org.example.model;

public class PrintedBook implements Book {
    @Override
    public String getInfo() { // getType емес, getInfo болуы керек
        return "Баспа кітап (Қағаз)";
    }
}