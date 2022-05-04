package com.zahid;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
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

    @Test
    @Parameters({"x", "y", "add"})
    public void testAddition(String x, String y, String add) {
        System.out.println("# Testing add() method");
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        double expected = Double.parseDouble(add);;
        double actual = calculator.add(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    @Parameters({"x", "y", "sub"})
    public void testSubtraction(String x, String y, String sub) {
        System.out.println("# Testing sub() method");
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        double expected = Double.parseDouble(sub);;
        double actual = calculator.sub(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    @Parameters({"x", "y", "mul"})
    public void testMultiplication(String x, String y, String mul) {
        System.out.println("# Testing mul() method");
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        double expected = Double.parseDouble(mul);;
        double actual = calculator.mul(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    @Parameters({"x", "y", "div"})
    public void testDivision(String x, String y, String div) {
        System.out.println("# Testing div() method");
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        double expected = Double.parseDouble(div);;
        double actual = calculator.div(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    @Parameters({"x", "y", "mod"})
    public void testModulus(String x, String y, String mod) {
        System.out.println("# Testing mod() method");
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        double expected = Double.parseDouble(mod);;
        double actual = calculator.mod(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test
    @Parameters({"x", "y", "pow"})
    public void testPower(String x, String y, String pow) {
        System.out.println("# Testing pow() method");
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        double expected = Double.parseDouble(pow);;
        double actual = calculator.pow(a, b);
        Assert.assertEquals(actual, expected);
    }

}
