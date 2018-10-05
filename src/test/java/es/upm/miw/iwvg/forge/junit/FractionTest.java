package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    Fraction fraction1, fraction2, fraction3;

    @BeforeEach
    void before() {
        fraction1 = new Fraction(2, 3);
        fraction2 = new Fraction(4, 6);
        fraction3 = new Fraction(5, 3);
    }

    @Test
    void testDecimal() {
        assertEquals(2f / 3f, fraction1.decimal(), 10e-5);
    }

    @Test
    void testIsPropia() {
        assertEquals(true, fraction1.isPropia());
    }

    @Test
    void testIsImpropia() {
        assertEquals(true, fraction3.isImpropia());
    }

}