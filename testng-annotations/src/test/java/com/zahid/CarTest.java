package com.zahid;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTest {
    
    @Test
    void testStartCar() {
        // Assert.fail();
        System.out.println("# Testing car start");
    }

    @Test(dependsOnMethods={"testStartCar"})
    void testDriveCar() {
        System.out.println("# Testing car driving");
    }
    
    @Test(dependsOnMethods={"testDriveCar"})
    void testStopCar() {
        System.out.println("# Testing car stop");
    }
    
    @Test(dependsOnMethods={"testDriveCar", "testStopCar"}, alwaysRun=true)
    void testParkCar() {
        System.out.println("# Testing car parking");
    }
}
