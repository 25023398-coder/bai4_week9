package com.banksystem;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.io.File;

public class FileLoggerTest {

    @Test
    void testPathCompatibility() {
        FileLogger logger = new FileLogger();
        String result = logger.getLogPath("logs", "app.log");
        assertTrue(result.contains(File.separator));
    }
    @Test
    void testHardcodedPathFailure() {
        String badPath = "logs\\app.log"; 
        assertTrue(badPath.contains(File.separator), 
            "loi: duong dan cung Windows se that bai tren moi truong Matrix khac");
    }
}