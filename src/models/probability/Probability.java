package models.probability;

import java.util.Objects;

public class Probability {
    private final double chance;

    private Probability(double chance) {
        this.chance = chance;
    }

    static public Probability create(double value) {
        if (value > 1.0 || value < 0.0) {
            throw new IllegalArgumentException("invalid probability");
        }

        return new Probability(value);
    }

    public Probability not() {
        return Probability.create(1 - chance);
    }

    public Probability and(Probability p2) {
        return new Probability(chance * p2.chance);
    }

    public Probability or(Probability p1) {
        return new Probability(p1.chance + chance - and(p1).chance);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(chance, that.chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }
}
