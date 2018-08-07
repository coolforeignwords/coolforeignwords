package com.coolforeignwords.service;

import java.util.ArrayList;
import java.util.List;

public class WordFinder {

    public List<String> findByLanguage(String language){
        List<String> words = new ArrayList<>();
        if ("Spanish".equals(language)){
            words.add("siesta");
            words.add("murcielago");
        }
        return words;
    }
}
