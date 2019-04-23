package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class CounterTestSuite {

    @Test
    public void testCalculateAdvStatistics() {
        //Given liczba postów = 0, liczba komentarzy = 0, liczba użytkowników = 0,
        Statistics statisticMock = mock(Statistics.class);
        Counter counter = new Counter();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 0; i++) {
            list.add("user");
        }
        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.usersNames()).thenReturn(list);

        //When
        counter.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(0, counter.averageCommentPerPost,0);
        Assert.assertEquals(0, counter.averageCommentPerUser,0);
        Assert.assertEquals(0, counter.averagePostPerUser,0);
    }

    @Test
    public void testCalculateAdvStatistics2() {
        //Given liczba postów = 1000, gdy liczba użytkowników = 100
        Statistics statisticMock = mock(Statistics.class);
        Counter counter = new Counter();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("user");
        }
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(10000);
        when(statisticMock.usersNames()).thenReturn(list);

        //When
        counter.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(10, counter.averageCommentPerPost,0);
        Assert.assertEquals(100, counter.averageCommentPerUser,0);
        Assert.assertEquals(10, counter.averagePostPerUser,0);
    }

    @Test
    public void testCalculateAdvStatistics3() {
        //Given liczba komentarzy < liczba postów
        Statistics statisticMock = mock(Statistics.class);
        Counter counter = new Counter();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("user");
        }
        when(statisticMock.postsCount()).thenReturn(100);
        when(statisticMock.commentsCount()).thenReturn(10);
        when(statisticMock.usersNames()).thenReturn(list);

        //When
        counter.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(0.1, counter.averageCommentPerPost, 0);
        Assert.assertEquals(1, counter.averageCommentPerUser,0);
        Assert.assertEquals(10, counter.averagePostPerUser,0);
    }

    @Test
    public void testCalculateAdvStatistics4() {
        //Given gdy liczba komentarzy > liczba postów
        Statistics statisticMock = mock(Statistics.class);
        Counter counter = new Counter();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i, "user");
        }
        when(statisticMock.postsCount()).thenReturn(10);
        when(statisticMock.commentsCount()).thenReturn(100);
        when(statisticMock.usersNames()).thenReturn(list);

        //When
        counter.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(10, counter.averageCommentPerPost,0);
        Assert.assertEquals(10, counter.averageCommentPerUser,0);
        Assert.assertEquals(1, counter.averagePostPerUser,0);
    }
}