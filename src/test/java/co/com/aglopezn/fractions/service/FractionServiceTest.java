package co.com.aglopezn.fractions.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class FractionServiceTest {

    @Test
    public void denominatorIsNotZero(){
        assertThrows(Exception.class, () -> new Fraction(1,0));
    }

    @Test
    public void aQuarterPlusAQuarterIsAHalf(){
        Fraction aQuarter = new Fraction(1,4);
        Fraction aHalf = new Fraction(1,2);
        assertEquals(aHalf, aQuarter.plus(aQuarter));
    }

    @Test
    public void aHalfPlusAHalfIsOne(){
        Fraction aHalf = new Fraction(1,2);
        Fraction one = new Fraction(1,1);
        assertEquals(one, aHalf.plus(aHalf));
    }

    @Test
    public void aHalfTimesAHalfIsAQuarter(){
        Fraction aQuarter = new Fraction(1,4);
        Fraction aHalf = new Fraction(1,2);
        assertEquals(aQuarter, aHalf.times(aHalf));
    }

    @Test
    public void aHalfMinusAQuarterIsAQuarter(){
        Fraction aQuarter = new Fraction(1,4);
        Fraction aHalf = new Fraction(1,2);
        assertEquals(aQuarter, aHalf.minus(aQuarter));
    }

    @Test
    public void aHalfMinusAHalfIsZero(){
        Fraction aHalf = new Fraction(1,2);
        Fraction zero = new Fraction(0,1);
        assertEquals(zero, aHalf.minus(aHalf));
    }

    @Test
    public void aHalfDividedByAHalfIsOne(){
        Fraction aHalf = new Fraction(1,2);
        Fraction one = new Fraction(1,1);
        assertEquals(one, aHalf.dividedBy(aHalf));
    }

    @Test
    public void fractionCannotBeDividedByZero(){
        Fraction aHalf = new Fraction(1,2);
        Fraction zero = new Fraction(0, 1);
        assertThrows(Exception.class, () -> aHalf.dividedBy(zero));
    }

    @Test
    public void fiveTenthsSimplifiedIsaHalf(){
        Fraction fiveTenths = new Fraction(5,10);
        Fraction aHalf = new Fraction(1,2);
        assertEquals(aHalf, fiveTenths.simplify());
    }
}
