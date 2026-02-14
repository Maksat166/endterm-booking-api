package org.example.patterns;
public class DatabaseConfig {
    private static DatabaseConfig instance;
    private DatabaseConfig() {}
    public static DatabaseConfig getInstance() {
        if (instance == null) instance = new DatabaseConfig();
        return instance;
    }
}