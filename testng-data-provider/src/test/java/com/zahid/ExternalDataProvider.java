package com.zahid;

import org.testng.annotations.DataProvider;

public class ExternalDataProvider {
        
    @DataProvider(name="AuthDataProvider")
    public Object[][] getData() {
        Object[][] data = {
            {"xyz@gmail.com", "xyz123"},
            {"xyz@gmail.com", "xyz@123"},
            {"admin@gmail.com", "admin@123"},
        };
        return data;
    }
}
