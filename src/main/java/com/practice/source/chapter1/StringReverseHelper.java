package com.practice.source.chapter1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class StringReverseHelper {

    private static final String EMPTY_STRING = "";

    private static final Logger LOG = LoggerFactory.getLogger(StringReverseHelper.class);

    public String reverse(String inputString) {
        LOG.info("Input string is {}", inputString);
        StringBuilder reveresedString = new StringBuilder();
        if (!Optional.ofNullable(inputString).isPresent()) {
            return EMPTY_STRING;
        }
        for (int i=inputString.length()-1; i>=0;i--) {
            reveresedString.append(inputString.charAt(i));
        }
        return reveresedString.toString();
    }
}
