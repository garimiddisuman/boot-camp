package models;

import models.comparators.LengthComparator;
import models.measurements.Lengths;
import org.junit.jupiter.api.Test;

class ComparatorTest {
    @Test
    void shouldCompareFeetAndInch() {
        assert(LengthComparator.compare(1, Lengths.FEET, 12, Lengths.INCH).equals(true));
        assert(LengthComparator.compare(2, Lengths.FEET, 24, Lengths.INCH).equals(true));
        assert(LengthComparator.compare(12, Lengths.INCH, 1, Lengths.FEET).equals(true));
        assert(LengthComparator.compare(2, Lengths.FEET, 23, Lengths.INCH).equals(false));
    }

    @Test
    void shouldCompareCmAndMM() {
        assert(LengthComparator.compare(1, Lengths.CM, 10, Lengths.MM).equals(true));
        assert(LengthComparator.compare(2, Lengths.CM, 20, Lengths.MM).equals(true));
        assert(LengthComparator.compare(20, Lengths.MM, 2, Lengths.CM).equals(true));
        assert(LengthComparator.compare(2, Lengths.MM, 2, Lengths.CM).equals(false));
    }

    @Test
    void shouldInchAndCm() {
        assert(LengthComparator.compare(2, Lengths.INCH, 5, Lengths.CM).equals(true));
        assert(LengthComparator.compare(2, Lengths.INCH, 5, Lengths.CM).equals(true));
    }
}
