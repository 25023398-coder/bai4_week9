package com.banksystem;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.io.File;

public class FileLoggerTest {

    @Test
    void testPathCompatibility() {
        FileLogger logger = new FileLogger();
        String result = logger.getLogPathModern("logs", "app.log");
        
        String expectedSeparator = File.separator;
        assertTrue(result.contains(expectedSeparator), 
            "duong dan phai su dung dung dau gach cua he dieu hanh: " + expectedSeparator);
    }

    @Test
    void testHardcodedPathFailure() {
        String badPath = "logs\\app.log"; 
        assertTrue(badPath.contains(File.separator), 
            "loi: duong dan cung Windows se that bai tren moi truong Matrix khac");
    }
}