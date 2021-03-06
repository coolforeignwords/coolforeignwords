package com.coolforeignwords.service;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WordFinderTest {

    @Test
    public void findByLanguage() {
        WordFinder wordFinder = new WordFinder();
        List<String> englishWords = wordFinder.findByLanguage("english");
        assertEquals(0, englishWords.size());
    }

    @Test
    public void japaneseNotSupported() {
        WordFinder wordFinder = new WordFinder();
        List<String> englishWords = wordFinder.findByLanguage("japanese");
        assertEquals(0, englishWords.size());
    }
    @Test
    public void dutchNotSupported() {
        WordFinder wordFinder = new WordFinder();
        List<String> englishWords = wordFinder.findByLanguage("dutch");
        assertEquals(2, englishWords.size());
    }
}
