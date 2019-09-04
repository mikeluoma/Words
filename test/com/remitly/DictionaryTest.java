package com.remitly;

import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

public class DictionaryTest {
    Dictionary dictionary = new Dictionary();

    @Test
    public void dictionaryShouldContainWordThis() {
        Assert.that(dictionary.isWord("this"), "Dictionary should contain word \"this\"");
    }

    @Test
    public void dictionaryShouldBeCaseInsensitive() {
        Assert.that(dictionary.isWord("tHiS"), "Dictionary should contain word \"tHiS\"");
    }

    @Test
    public void dictionaryShouldNotHaveGarbageWord() {
        Assert.that(!dictionary.isWord("asdf"), "Dictionary should not contain word \"asdf\"");
    }
}
