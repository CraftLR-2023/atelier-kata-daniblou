package dev.craftlr.exercice2;

import org.junit.jupiter.api.Test;

import dev.craftlr.exercice2.TennisGame1;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisTest {
    @Test
    void test_an_new_tennis_game_should_have_a_zero_zero_score() {
        TennisGame1 game = new TennisGame1("player1", "player2");
        assertThat(game.getScore()).isEqualTo("0 - 0");
    }
}
