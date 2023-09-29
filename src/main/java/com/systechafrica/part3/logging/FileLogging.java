package com.systechafrica.part3.logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class FileLogging {
    private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("log.txt", true);
        CustomFormatter formatter = new CustomFormatter();

        File file = new File("log.txt");
        FileWriter fr = new FileWriter(file, true);
        fr.write("data");
        fr.close();

        LOGGER.addHandler(fileHandler);
        fileHandler.setFormatter(formatter);

        LOGGER.info("Info log\n");
        LOGGER.warning("Warning log\n");
        LOGGER.severe("Error log\n");
        test();

    }

    public static void test() {
        LOGGER.info("Info log in test\n");
        LOGGER.warning("Warning log in test\n");
        LOGGER.severe("Error log in test\n");
    }
}
