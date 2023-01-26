package dev.craftlr.exercice4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PaginationTest {
    @Test
    void shouldGetPageTwoOfFive() {
        Pagination pagination = new Pagination(2,5);
        assertThat(pagination.display()).isEqualTo("1 (2) 3 4 5");
    }

}
