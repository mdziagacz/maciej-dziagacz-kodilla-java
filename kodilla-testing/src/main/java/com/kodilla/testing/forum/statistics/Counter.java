package com.kodilla.testing.forum.statistics;

public class Counter {
    public double averagePostPerUser;
    public double averageCommentPerUser;
    public double averageCommentPerPost;

    public boolean calculateAdvStatistics(Statistics statistics) {

        double posts = statistics.postsCount();
        double comments = statistics.commentsCount();
        double users = statistics.usersNames().size();

        if (users == 0 || posts == 0) {
            return false;
        }
        else {
            averagePostPerUser = posts / users;
            averageCommentPerUser = comments / users;
            averageCommentPerPost = comments / posts;
            return true;
        }
    }
}