package com.github.mateuszrasinski.microservices.udemy.randomwordgenerator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Objects;

@Component
class RandomWordGenerator {

    private final String words;
    private static final SecureRandom RANDOM = new SecureRandom();

    RandomWordGenerator(@Value("${words}") String words) {
        this.words = Objects.requireNonNull(words);
    }

    String generate() {
        return randomWord().trim();
    }

    private String randomWord() {
        String[] wordsSplittedByComma = words.split(",");
        return wordsSplittedByComma[RANDOM.nextInt(wordsSplittedByComma.length)];
    }
}
