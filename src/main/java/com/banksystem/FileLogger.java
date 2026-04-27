package com.banksystem;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLogger {
    public String getLogPathLegacy(String folder, String filename) {
        return folder + File.separator + filename;
    }

    public String getLogPathModern(String folder, String filename) {
        Path path = Paths.get(folder, filename);
        return path.toString();
    }
}