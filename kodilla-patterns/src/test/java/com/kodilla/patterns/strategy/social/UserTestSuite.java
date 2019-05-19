package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User maciek = new ZGeneration("maciek");
        User krzysiek = new YGeneration("krzysiek");
        User robert = new Millenials("robert");

        //When
        String maciekPrefer = maciek.sharePost();
        System.out.println(maciekPrefer);
        String krzysiekPrefer = krzysiek.sharePost();
        System.out.println(krzysiekPrefer);
        String robertPrefer = robert.sharePost();
        System.out.println(robertPrefer);

        Assert.assertEquals("Snapchat",maciekPrefer);
        Assert.assertEquals("Facebook",krzysiekPrefer);
        Assert.assertEquals("Twitter",robertPrefer);
    }

    @Test
    public void testIndividualSharingStrategy(){
        User maciek = new ZGeneration("maciek");

        maciek.setPrefferedMedia(new FacebookPublisher());
        String maciekPrefer = maciek.sharePost();
        System.out.println(maciekPrefer);

        Assert.assertEquals("Facebook",maciekPrefer);
    }
}
