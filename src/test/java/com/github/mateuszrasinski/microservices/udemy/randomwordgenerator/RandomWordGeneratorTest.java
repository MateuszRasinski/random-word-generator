package com.github.mateuszrasinski.microservices.udemy.randomwordgenerator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RandomWordGeneratorTest {

    @Test
    void generateWordFromWords() {
        //given
        String words = "  alpha,  bravo,charlie, delta, echo foxtrot\n";
        //when
        String generatedWord = new RandomWordGenerator(words).generate();
        //then
        assertThat(generatedWord).isIn("alpha", "bravo", "charlie", "delta", "echo foxtrot");
    }

    @Test
    void throwExceptionIfWordsAreNull() {
        //given
        String words = null;
        //expect
        assertThatThrownBy(() -> new RandomWordGenerator(words).generate()).isInstanceOf(Exception.class);
    }

    @Test
    void notThrowExceptionIfWordsAreEmptyString() {
        //given
        String words = "";
        RandomWordGenerator randomWordGenerator = new RandomWordGenerator(words);
        //expect
        assertThatCode(randomWordGenerator::generate).doesNotThrowAnyException();
    }
}
