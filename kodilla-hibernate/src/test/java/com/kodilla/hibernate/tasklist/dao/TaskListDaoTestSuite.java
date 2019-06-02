package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("task1", "description of task1");
        taskListDao.save(taskList);

        //When
        List<TaskList> readTaskList = taskListDao.findByListName("task1");

        //Then
        Assert.assertEquals(1, readTaskList.size());
        Assert.assertEquals("task1", readTaskList.get(0).getListName());

        //CleanUp
        taskListDao.deleteById(taskList.getId());
    }
}
