package com.practice.source.chapter1;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class StringDuplicateCharRemoveHelperTest {
    
    @Test
    @Parameters({"leno, leno"})
    public void verifyRemoveDuplicateCharAndReturnString(String inputString, String responseString) {
        assertThat(new StringDuplicateCharRemoveHelper().removeDuplicateCharAndReturnString(inputString), is(responseString));
    }
}
