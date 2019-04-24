package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> listOfForumUser = new ArrayList<>();

    public Forum() {
        listOfForumUser.add(new ForumUser(1, "Piter", 'M', LocalDate.of(1999, 8, 20), 5));
        listOfForumUser.add(new ForumUser(2, "Mark", 'M', LocalDate.of(2000, 5, 1), 51));
        listOfForumUser.add(new ForumUser(3, "Mat", 'M', LocalDate.of(1991, 1, 15), 6));
        listOfForumUser.add(new ForumUser(4, "Elena", 'F', LocalDate.of(1995, 3, 10), 25));
        listOfForumUser.add(new ForumUser(5, "Roma", 'F', LocalDate.of(2000, 5, 21), 75));
        listOfForumUser.add(new ForumUser(6, "Cora", 'F', LocalDate.of(1989, 8, 10), 64));
        listOfForumUser.add(new ForumUser(7, "Douglas", 'M', LocalDate.of(1966, 10, 11), 12));
        listOfForumUser.add(new ForumUser(8, "Emmet", 'M', LocalDate.of(1986, 12, 23), 1));
        listOfForumUser.add(new ForumUser(9, "Chris", 'M', LocalDate.of(1955, 11, 2), 0));
        listOfForumUser.add(new ForumUser(10, "Rosie", 'F', LocalDate.of(1974, 2, 12), 58));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfForumUser);
    }
}
