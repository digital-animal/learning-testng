package com.zahid;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTest {

    @Test(priority=1)
    public void setUp() {
        System.out.println("> Opening account");
    }

    @Test(priority=2)
    public void deporit() {
        System.out.println("> Deposit money test");
    }
    
    @Test(priority=3)
    public void withdraw() {
        // Assert.fail();
        System.out.println("> withdraw money test");
    }
    
    @Test(priority=4)
    public void tearDown() {
        Assert.assertEquals(true, true);
        System.out.println("> Closing account");
    }
}
