package com.zahid;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RectangleTest {

    public Rectangle rectangle = null;
    public double length;
    public double breadth;
    
    @BeforeClass
    public void setUp() {
        System.out.println();
        System.out.println("# Rectangle Testing Begins");
    }
    
    @AfterClass
    public void tearDown() {
        System.out.println("# Rectangle Testing Ends");
    }
        
    @Test(groups={"sanity"})
    void testArea() {
        System.out.println("# Testing area() method");
        double length = 36;
        double breadth = 24;
        double expected = 864;
        rectangle = new Rectangle(length, breadth);
        double actual = rectangle.area();
        Assert.assertEquals(actual, expected);
    }
    
    @Test(groups={"regression"})
    void testIsSquare() {
        System.out.println("# Testing isSquare() method");
        // Utility.sleep(200);
        double length = 36;
        double breadth = 24;
        rectangle = new Rectangle(length, breadth);
        boolean expected = false;
        boolean actual = rectangle.isSquare();
        Assert.assertEquals(actual, expected);
    }
    
    @Test(groups={"sanity", "regression"})
    void testPerimeter() {
        System.out.println("# Testing perimeter() method");
        double length = 36;
        double breadth = 24;
        rectangle = new Rectangle(length, breadth);
        double expected = 120;
        double actual = rectangle.perimeter();
        Assert.assertEquals(actual, expected);

    }
}
