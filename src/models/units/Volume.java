package models.units;


import java.util.Objects;

public class Volume {

    private final double litre;

    private Volume(double litre) {
        this.litre = litre;
    }

    public static Volume createFromLitre(double litre) {
        return getVolume(1, litre);
    }

    public static Volume createFromGallon(double gallon) {
    return getVolume(3.78, gallon);
    }

    private static Volume getVolume(double factor, double v) {
        return new Volume(factor * v);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(litre, volume.litre) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(litre);
    }
}
