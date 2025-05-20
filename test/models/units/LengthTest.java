package models.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldCompareInchAndFeet() {
        Length fromInch = Length.createFromInch(12);
        Length fromFeet = Length.createFromFeet(1);

        assertEquals(fromFeet, fromInch);
    }

    @Test
    void shouldCompareFeetAndCm() {
        Length fromInch = Length.createFromInch(2);
        Length fromCm = Length.createFromCm(5);

        assertEquals(fromCm, fromInch);
    }

    @Test
    void shouldCompareCmAndMm() {
        Length fromCm = Length.createFromCm(1);
        Length fromMm = Length.createFromMm(10);

        assertEquals(fromCm, fromMm);
    }
}