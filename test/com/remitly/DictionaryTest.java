package com.remitly;

import org.junit.Assert;
import org.junit.Test;

public class DictionaryTest {
    Dictionary dictionary = new Dictionary();

    @Test
    public void dictionaryShouldContainWordThis() {
        Assert.assertTrue("Dictionary should contain word \"this\"", dictionary.isWord("this"));
    }

    @Test
    public void dictionaryShouldBeCaseInsensitive() {
        Assert.assertTrue("Dictionary should contain word \"tHiS\"", dictionary.isWord("tHiS"));
    }

    @Test
    public void dictionaryShouldNotHaveGarbageWord() {
        Assert.assertFalse("Dictionary should not contain word \"asdf\"", dictionary.isWord("asdf"));
    }
}
