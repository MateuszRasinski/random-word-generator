package com.github.mateuszrasinski.microservices.udemy.randomwordgenerator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/word")
class WordController {
    private final RandomWordGenerator randomWordGenerator;

    WordController(RandomWordGenerator randomWordGenerator) {
        this.randomWordGenerator = randomWordGenerator;
    }

    @GetMapping
    String getWord() {
        return randomWordGenerator.generate();
    }
}
