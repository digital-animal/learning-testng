package com.zahid;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class RectangleTest {

    public Rectangle rectangle = null;
    public static int counter = 0;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("# This will execute before test suite begins");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("# This will execute before after suite ends");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("# Rectangle class instantiated");
        double length = 36, breadth = 24;
        rectangle = new Rectangle(length, breadth);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("# Rectangle class destroyed");
        rectangle = null;
    }
    
    @BeforeMethod
    public void beforeMethod() {
        System.out.printf("# Rectangle: This will execute before each method: %d\n", ++counter);
    }
    
    @AfterMethod
    public void afterMethod() {
        System.out.printf("# Rectangle: This will execute after each method: %d\n", ++counter);
    }

    @Test(priority=3)
    void testArea() {
        System.out.println("# Testing area() method");
        double expected = 864;
        double actual = rectangle.area();
        Assert.assertEquals(actual, expected);
    }
    
    @Test(priority=1)
    void testIsSquare() {
        System.out.println("# Testing isSquare() method");
        // Utility.sleep(200);
        boolean expected = false;
        boolean actual = rectangle.isSquare();
        Assert.assertEquals(actual, expected);
    }
    
    @Test(priority=2)
    void testPerimeter() {
        System.out.println("# Testing perimeter() method");
        double expected = 120;
        double actual = rectangle.perimeter();
        Assert.assertEquals(actual, expected);

    }
}
