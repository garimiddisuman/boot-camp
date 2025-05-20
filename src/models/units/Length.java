package models.units;
import java.util.Objects;

public class Length {
    private final double mm;

    public Length(double mm) {
        this.mm = mm;
    }

    public static Length createFromInch(double inch) {
        return getLength(inch , 25.4);
    }

    private static Length getLength(double inch, double factor) {
        return new Length(inch * factor / 1);
    }

    public static Length createFromFeet(double feet) {
        return getLength(feet , 304.8);
    }

    public static Length createFromCm(double cm) {
        return getLength(10 , cm);
    }

    public static Length createFromMm(double mm) {
        return getLength(mm , 1);
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

    public Length add(Length other) {
        return new Length(other.mm + mm);
    }
}
