package models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test

    public void shouldRepresentProbability() {
        Probability probability = Probability.create(0.2);
        Probability complimented = probability.not();

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
    void shouldRepresentsNotProbability() {
        Probability probability = Probability.create(0.1);
        assertEquals(Probability.create(0.9), probability.not());
    }

    @Test
    void shouldRepresentOrProbability() {
        Probability p1 = Probability.create(0.5);
        Probability p2 = Probability.create(0.5);

        assertEquals(Probability.create(0.75), p1.or(p2));
    }

    @Test
    void shouldThrowExceptionsForInvalidProbability() {
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> Probability.create(1.2));
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> Probability.create(-1));

        assertEquals("invalid probability", exception1.getMessage());
        assertEquals("invalid probability", exception2.getMessage());
    }
}
