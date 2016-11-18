package com.leveluplunch.paractice1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterNullTest {

    @Test
    public void remove_null_from_list() {
        List<String> strings = new ArrayList<>();
        strings.add(null);
        strings.add("www");
        strings.add(null);
        strings.add("leveluplunch");
        strings.add("com");
        strings.add(null);

        strings.removeAll(Collections.singleton(null));
        Assert.assertEquals(3, strings.size());
    }

    @Test
    public void remove_null_from_list_java_8_way() {
        List<String> strings = new ArrayList<>();
        strings.add(null);
        strings.add("www");
        strings.add(null);
        strings.add("leveluplunch");
        strings.add("com");
        strings.add(null);

        List<String> filterStrings = strings.stream().filter(s -> s != null).collect(Collectors.toList());
        Assert.assertEquals(3, filterStrings.size());
    }

    @Test
    public void remove_null_from_list_java_8_way_new() {
        List<String> strings = new ArrayList<>();
        strings.add(null);
        strings.add("www");
        strings.add(null);
        strings.add("leveluplunch");
        strings.add("com");
        strings.add(null);

        List<String> filterStrings = strings.stream().filter(s -> Objects.nonNull(s)).collect(Collectors.toList());
        Assert.assertEquals(3, filterStrings.size());
    }
}
