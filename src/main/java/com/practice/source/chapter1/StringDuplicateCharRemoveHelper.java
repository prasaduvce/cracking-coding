package com.practice.source.chapter1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class StringDuplicateCharRemoveHelper {

    private static final Logger LOG = LoggerFactory.getLogger(StringDuplicateCharRemoveHelper.class);
    /**
     * Remove duplicate characters in String and
     * return string which contain unique characters
     * @param inputString
     * @return
     */
    public String removeDuplicateCharAndReturnString(String inputString) {
        StringUniqueCheckHelper stringUniqueCheckHelper = new StringUniqueCheckHelper();
        if (stringUniqueCheckHelper.isStringHasUniqueCharacters(inputString)) {
            LOG.info("String {} has all unique characters. Nothing to remove from string.");
            return inputString;
        }

        return null;
    }

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
