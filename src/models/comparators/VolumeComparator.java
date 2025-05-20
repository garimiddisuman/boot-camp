package models.comparators;

import models.measurements.Volumes;

public class VolumeComparator {
    private final boolean b;

    private VolumeComparator(boolean b) {
        this.b = b;
    }

    public static VolumeComparator compare(double v1, Volumes u1, double v2, Volumes u2) {
        double s1 = converterToStandard(v1, u1);
        double s2 = converterToStandard(v2, u2);

        return new VolumeComparator(s1 == s2);
    }

    private static double converterToStandard(double v, Volumes u) {
        switch (u) {
            case GALLON: return 3.78 * v;
            case LITRE: return v;
            default: return 0;
        }
    }

    public boolean equals(boolean v) {
        return  v == b;
    }
}
