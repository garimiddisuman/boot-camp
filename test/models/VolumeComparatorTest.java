package models;

import models.comparators.VolumeComparator;
import models.measurements.Volumes;
import org.junit.jupiter.api.Test;

class VolumeComparatorTest {
    @Test
    void shouldCompareGallonAndLitre() {
        assert(VolumeComparator.compare(1, Volumes.GALLON, 3.78, Volumes.LITRE).equals(true));
        assert(VolumeComparator.compare(3.78, Volumes.LITRE, 1, Volumes.GALLON).equals(true));
        assert(VolumeComparator.compare(3, Volumes.LITRE, 1, Volumes.GALLON).equals(false));
    }
}
