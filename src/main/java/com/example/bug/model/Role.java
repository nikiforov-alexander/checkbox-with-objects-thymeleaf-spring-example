package com.example.bug.model;


public enum Role {
    FIRST("first", 1),
    SECOND("second", 2);
    private final int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private final String name;
    Role(String name, int id) {
        this.id = id;
        this.name = name;
    }
}
