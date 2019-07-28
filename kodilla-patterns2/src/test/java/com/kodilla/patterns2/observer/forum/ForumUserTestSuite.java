package com.kodilla.patterns2.observer.forum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser joshSmith = new ForumUser("John Smith");
        ForumUser ivoneEsbobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(joshSmith);
        javaToolsForum.registerObserver(ivoneEsbobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("post 1");
        javaHelpForum.addPost("post 2");
        javaHelpForum.addPost("post 4");
        javaToolsForum.addPost("post 5");
        javaToolsForum.addPost("post 3");
        //Then
        assertEquals(3, joshSmith.getUpdateCount());
        assertEquals(2, ivoneEsbobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
