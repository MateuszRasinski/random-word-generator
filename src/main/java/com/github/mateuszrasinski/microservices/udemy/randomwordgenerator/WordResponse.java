package com.github.mateuszrasinski.microservices.udemy.randomwordgenerator;

class WordResponse {
    private final String word;

    WordResponse(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
