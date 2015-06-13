package com.practice.source.chapter1;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class StringUniqueCheckHelperTest {

    @Test
    @Parameters({"abb, a, 0, false", "abb, b, 1, true",
            "abb, c, 1, false", "abb, b, 2, true",
            "abb, b, 1, true","abbcbb, c, 3, false",
            "abbcdeef, f, 7, false"})
    public void verifyWhetherStringContainCharacter(String inputString, char keyCharacter, int index, boolean isValid) {
        Assert.assertThat(new StringUniqueCheckHelper().isStringContainsCharacterExcludingIndex(inputString, keyCharacter, index), Is.is(isValid));

    }

    @Test
    @Parameters({"abb, false","ab, true","abccddeeff, false", "abcdefghijkl, true", "RenukaPrasad, false","sample, true", "sesame, false"})
    public void verifyWhetherStringHasUniqueCharacters(String input, boolean isValid) {
        Assert.assertThat(new StringUniqueCheckHelper().isStringHasUniqueCharacters(input), Is.is(isValid));
    }

    @Test
    @Parameters({"abb, false","ab, true","abccddeeff, false", "abcdefghijkl, true", "RenukaPrasad, false"})
    public void verifyWhetherStringHasUniqueCharacters2(String input, boolean isValid) {
        Assert.assertThat(new StringUniqueCheckHelper().isUniqueChars2(input), Is.is(isValid));
    }
}
