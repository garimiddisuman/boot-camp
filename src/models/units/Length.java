package models.units;
import java.util.Objects;

public class Length {
    private final double mm;

    public Length(double v) {
        this.mm = Math.floor(v);
    }

    public static Length createFromInch(double inch) {
        return new Length(inch * 25.4);
    }

    public static Length createFromFeet(double feet) {
        return new Length(feet * 304.8);
    }

    public static Length createFromCm(double cm) {
        return new Length(10 * cm);
    }

    public static Length createFromMm(double mm) {
        return new Length(mm);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(mm, length.mm) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mm);
    }
}
