package com.zahid;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {

    @Test(priority=1)
    public void setUp() {
        System.out.println("$ Opening browser");
    }

    @Test(priority=2)
    public void searchCustomer() {
        System.out.println("$ This is search customer test");
    }

    @Test(priority=3)
    public void addCustomer() {
        // Assert.fail();
        System.out.println("$ This is add customer test");
    }
    
    @Test(priority=4)
    public void deleteCustomer() {
        // Assert.assertEquals(true, false);
        System.out.println("$ This is delete customer test");
    }
    
    @Test(priority=5)
    public void tearDown() {
        Assert.assertEquals(true, true);
        System.out.println("$ Closing browser");
    }
}
