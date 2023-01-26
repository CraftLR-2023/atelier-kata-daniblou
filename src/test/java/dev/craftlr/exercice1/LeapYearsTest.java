package dev.craftlr.exercice1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearsTest {
    @Test
    void shouldNotBeLeapYearsFor2021() {
        assertThat(Years.isLeap(2021)).isFalse();
    }
}
