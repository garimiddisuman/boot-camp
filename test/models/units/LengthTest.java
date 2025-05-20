package models.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldCompareInchAndFeet() {
        Length twelveInches = Length.createFromInch(12);
        Length oneFeet = Length.createFromFeet(1);

        assertEquals(oneFeet, twelveInches);
    }

    @Test
    void shouldCompareFeetAndCm() {
        Length twoInches = Length.createFromInch(2);
        Length fiveCm = Length.createFromCm(5);

        assertEquals(fiveCm, twoInches);
    }

    @Test
    void shouldCompareCmAndMm() {
        Length oneCm = Length.createFromCm(1);
        Length tenMm = Length.createFromMm(10);

        assertEquals(oneCm, tenMm);
    }

    @Test
    void shouldAddInches() {
        Length twoInches = Length.createFromInch(2);
        Length fourInches = Length.createFromInch(4);

        assertEquals(fourInches, twoInches.add(twoInches));
    }
}