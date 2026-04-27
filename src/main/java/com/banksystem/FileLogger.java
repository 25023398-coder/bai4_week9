package com.banksystem;

import java.io.File;

public class FileLogger {
  public String getLogPath(String folder, String filename) {
    return folder + File.separator + filename;
  }
}