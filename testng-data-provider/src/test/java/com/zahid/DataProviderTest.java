package com.zahid;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider="LoginDataProvider")
    public void loginTest(String email, String password) {
        System.out.println(email + " : " + password);
    }
    
    @Test(dataProvider="AuthDataProvider", dataProviderClass=ExternalDataProvider.class)
    public void authTest(String email, String password) {
        System.out.println(email + " : " + password);
    }
    
    @DataProvider(name="LoginDataProvider")
    public Object[][] getData() {
        Object[][] data = {
            {"abc@gmail.com", "abc123"},
            {"abc@gmail.com", "abc@123"},
            {"admin@gmail.com", "abc@123"},
        };
        return data;
    }

}
