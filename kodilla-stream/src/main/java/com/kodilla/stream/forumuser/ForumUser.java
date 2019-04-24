package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    int userID;
    String userName;
    char sex;
    LocalDate userBirthDate;
    int numberOfPosts;

    public ForumUser(int userID, String userName, char sex, LocalDate userBirthDate, int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.userBirthDate = userBirthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getUserBirthDate() {
        return userBirthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "user name: '" + userName + '\'' +
                ", sex: " + sex +
                ", birth date: " + userBirthDate +
                ", posts: " + numberOfPosts;
    }
}
