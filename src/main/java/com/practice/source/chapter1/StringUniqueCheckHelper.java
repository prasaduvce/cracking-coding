package com.practice.source.chapter1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class StringUniqueCheckHelper {

    private static final Logger LOG = LoggerFactory.getLogger(StringUniqueCheckHelper.class);

    //Solution 1
    public boolean isUniqueChars2(String inputString) {
        LOG.info("Received Input String ==> {}" , inputString);
        boolean [] char_set = new boolean [256];
        for (int i=0; i<inputString.length(); i++) {
            int val = inputString.charAt(i);
            if (char_set[val])
                return false;
            char_set[val] = true;
        }
        return true;
    }

    //Solution 2
    public boolean isStringHasUniqueCharacters(String inputString) {
        LOG.info("Received Input String ==> {}" , inputString);
        boolean flag = true;
        if (!Optional.ofNullable(inputString).isPresent()) {
            flag = false;
        }
        for (int i=0; i<inputString.length(); i++) {
            char keyCharacter = inputString.charAt(i);
            flag = !isStringContainsCharacterExcludingIndex(inputString, keyCharacter, i);
            if (!flag) {
                return flag;
            }
        }
        return flag;
    }

    public boolean isStringContainsCharacterExcludingIndex(String inputString, char keyCharacter, int excludeIndex) {
        LOG.info("Received input parameters {}, {} and {} ", inputString, keyCharacter, excludeIndex);
        boolean flag = false;
        for (int j=0; j< inputString.length(); j++) {
            if (excludeIndex == j) {
                continue;
            }
            if (keyCharacter == inputString.charAt(j)) {
                flag = true;
            }
        }
        return flag;
    }
}
