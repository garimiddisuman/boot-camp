package models.comparators;
import models.measurements.Lengths;

public class LengthComparator {
    private final boolean value;

    private LengthComparator(boolean value) {
        this.value = value;
    }

    private static long round(double value) {
        return Math.round(value);
    }

    private static double convertToMM(double value, Lengths unit) {
        switch (unit) {
            case FEET : return value * 304.8;
            case INCH : return value * 25.4;
            case MM : return value;
            case CM : return value * 10;
            default: return 0;
        }
    }

    public static LengthComparator compare(double v1, Lengths u1, double v2, Lengths u2) {
        double mm1 = convertToMM(v1, u1);
        double mm2 = convertToMM(v2, u2);

        return new LengthComparator(round(mm1) == round(mm2));
    }

    public boolean equals(boolean v) {
        return value == v;
    }
}
