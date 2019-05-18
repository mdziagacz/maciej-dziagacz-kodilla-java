package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLog(){
        //Given
        Logger.getInstance().log("user logged");
        Logger.getInstance().log("file opened");
        Logger.getInstance().log("pivot created");
        Logger.getInstance().log("file saved");
        Logger.getInstance().log("file closed");
        Logger.getInstance().log("user logged out");

        //When
        String lasLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("user logged out", lasLog);
    }
}
