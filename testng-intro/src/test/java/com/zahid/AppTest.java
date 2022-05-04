package com.zahid;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    
    @Test(invocationCount=10)
    public void testInvocationCount() {
        System.out.println("# Invocation Count Test");
        int a = 4;
        int b = 9;
        int sum = a + b;
        int expected = 13;
        int actual = sum;
        Assert.assertEquals(actual, expected);
    }

    @Test(timeOut=2000, expectedExceptions=Exception.class)
    public void testTimeOut() {
        Utility.sleep(2500);
        // Utility.sleep(1500);
    }
}