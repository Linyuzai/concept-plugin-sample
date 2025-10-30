package com.github.linyuzai.concept.plugin.sample.server;

import org.slf4j.Logger;

public class Utils {

    private static final int length = 100;

    public static void wrap(Logger logger, String message, Runnable runnable) {
        logger.info(stringBuilder(message, "start").toString());
        runnable.run();
        logger.info(stringBuilder(message, "end").append('\n').toString());
    }

    private static StringBuilder stringBuilder(String... str) {
        StringBuilder start = new StringBuilder(String.join(" ", str)).append(" ");
        while (start.length() < length) {
            start.append("=");
        }
        return start;
    }
}
