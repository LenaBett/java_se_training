package com.systechafrica.part3.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class FileLogging {
    private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("log.txt");
        CustomFormatter formatter = new CustomFormatter();

        LOGGER.addHandler(fileHandler);
        fileHandler.setFormatter(formatter);

        LOGGER.info("Info log\n");
        LOGGER.warning("Warning log\n");
        LOGGER.severe("Error log\n");
        test();

    }

    public static void test(){
        LOGGER.info("Info log in test\n");
        LOGGER.warning("Warning log in test\n");
        LOGGER.severe("Error log in test\n");
    }

    static class CustomFormatter extends Formatter{


        @Override
        public String format(LogRecord record) {
            String method = (record.getSourceMethodName());
            String level = (record.getLevel().getName());
            String message = (record.getMessage());
            return method + " | " + level +" | "+ message;
        }
    }
}
