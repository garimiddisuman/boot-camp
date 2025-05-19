package models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test

    public void shouldRepresentProbability() {
        Probability probability = Probability.create(0.2);
        Probability complimented = probability.compliment();

        assert(complimented.equals(Probability.create(0.8)));
    }

    @Test
    void shouldRepresentAndProbability() {
        Probability p1 = Probability.create(0.5);
        Probability p2 = Probability.create(0.5);
        Probability p3 = p1.and(p2);

        assert(p3.equals(Probability.create(0.25)));
    }

    @Test
    void shouldThrowExceptionsForInvalidProbability() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Probability.create(1.2));
        assertEquals("invalid probability", exception.getMessage());
    }
}
