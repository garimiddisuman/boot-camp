package models.enums;

public enum CoinFlip {
    HEAD(0.5),
    TAIL(0.5);

    private final double probability;

    CoinFlip(double probality) {
        this.probability = probality;
    }

    public double getProbability() {
        return probability;
    }
}