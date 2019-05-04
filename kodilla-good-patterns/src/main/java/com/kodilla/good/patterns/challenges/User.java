package com.kodilla.good.patterns.challenges;

public class User {
    final private int userID;
    final private String name;
    final private String mail;

    public User(final int userID, final String name, final String mail) {
        this.userID = userID;
        this.name = name;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
