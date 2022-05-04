package com.zahid;

import org.testng.annotations.Test;

public class FirstTest {

    @Test(priority=1)
    public void setUp() {
        System.out.println("# Opening browser");
    }

    @Test(priority=2)
    public void login() {
        System.out.println("# This is login test");
    }

    @Test(priority=3)
    public void tearDown() {
        System.out.println("# Closing browser");
    }
}
