package com.zahid;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {

    public Calculator calculator = null;
    public static int counter = 0;
    
    @BeforeClass
    public void setUp() {
        System.out.println("# Calculator object instantiated");
        calculator = new Calculator();
        
    }
    
    @AfterClass
    public void tearDown() {
        System.out.println("# Calculator object destroyed");
        calculator = null;
        
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("# This will execute before all tests");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("# This will execute after all tests");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.printf("# Calculator: This will execute before each method: %d\n", ++counter);
    }
    
    @BeforeMethod
    public void afterMethod() {
        System.out.printf("# Calculator: This will execute after each method: %d\n", ++counter);
    }
    
    @Test(priority=5)
    public void testAddition() {
        System.out.println("# Testing add() method");
        double x = 144, y = 36;
        double expected = 180;
        double actual = calculator.add(x, y);
        Assert.assertEquals(actual, expected);
    }
    
    @Test(priority=6)
    public void testSubtraction() {
        System.out.println("# Testing sub() method");
        double x = 144, y = 36;
        double expected = 108;
        double actual = calculator.sub(x, y);
        Assert.assertEquals(actual, expected);
    }

    @Test(priority=2)
    public void testMultiplication() {
        System.out.println("# Testing mul() method");
        // Utility.sleep(600);
        double x = 144, y = 36;
        double expected = 5184;
        double actual = calculator.mul(x, y);
        Assert.assertEquals(actual, expected);
    }
    
    @Test(priority=3, enabled=false)
    public void testDivision() {
        System.out.println("# Testing div() method");
        // Utility.sleep(2000);
        double x = 144, y = 36;
        double expected = 4;
        double actual = calculator.div(x, y);
        Assert.assertEquals(actual, expected);
    }
    
    @Test(priority=4, enabled=false)
    public void testModulus() {
        System.out.println("# Testing mod() method");
        double x = 19, y = 7;
        double expected = 5;
        double actual = calculator.mod(x, y);
        Assert.assertEquals(actual, expected);
    }
    
    @Test(priority=1)
    public void testPower() {
        System.out.println("# Testing pow() method");
        int x = 2, n = 16;
        int expected = 65536;
        double actual = calculator.pow(x, n);
        Assert.assertEquals(actual, expected);
    }

}
