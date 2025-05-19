package models;

import models.enums.CoinFlip;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void shouldFlipCoin() {
        assertEquals(0.5, CoinFlip.HEAD.getProbability(), "should return 0.5 for head");
        assertEquals(0.5, CoinFlip.TAIL.getProbability(), "should return 0.5 for tail");
    }
}
