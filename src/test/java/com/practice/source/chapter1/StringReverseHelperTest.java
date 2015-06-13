package com.practice.source.chapter1;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class StringReverseHelperTest {
    
    @Test
    @Parameters({"hello, olleh", "null, llun"})
    public void verifyReverse(String inputString, String reversedString) {
        assertThat(new StringReverseHelper().reverse(inputString), is(reversedString));
    }
}
