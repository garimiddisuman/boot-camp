package models.units;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldCompareLitreAndGallon() {
        Volume fromLitre = Volume.createFromLitre(3.78);
        Volume fromGallon = Volume.createFromGallon(1);

        assertEquals(fromLitre, fromGallon);
    }


}