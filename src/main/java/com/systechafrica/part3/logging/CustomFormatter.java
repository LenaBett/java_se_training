package com.systechafrica.part3.logging;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");

    @Override
    public String format(LogRecord record) {
        String method = (record.getSourceMethodName());
        String level = (record.getLevel().getName());
        String message = (record.getMessage());
        Instant instant = Instant.ofEpochSecond(record.getMillis());
        LocalDateTime now = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return pattern.format(now) + " | " + method + " | " + level + " | " + message + "\n";
    }
}

