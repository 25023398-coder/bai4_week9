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
}