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
        fraction3= new Fraction(5,3);
    }

    @Test
    void testDecimal() {
        assertEquals(2f/3f, fraction1.decimal(), 10e-5);
    }

    @Test
    void testIsPropiaTrue(){
        assertEquals(true, fraction1.isPropia(fraction1));
    }

    @Test
    void testIsPropiaFalse(){
        assertEquals(false, fraction1.isPropia(fraction3));
    }

    @Test
    void testIsImpropiaTrue(){
        assertEquals(true, fraction1.isImpropia(fraction3));
    }

    @Test
    void testIsImpropiaFalse(){
        assertEquals(false, fraction1.isImpropia(fraction1));
    }

    @Test
    void testIsImpropia(){}

    @Test
    void testIsEquivalenteTrue(){
        assertEquals(true, fraction1.isEquivalente(fraction2));

    }

    @Test
    void testIsEquivalenteFalse(){
        assertEquals(false, fraction1.isEquivalente(fraction3));

    }
}