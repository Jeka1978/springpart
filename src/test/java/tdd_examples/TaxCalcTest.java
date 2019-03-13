package tdd_examples;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxCalcTest {

    @Test
    public void withMaam() {
        TaxCalc taxCalc = new TaxCalc();
        double withMaam = taxCalc.withMaam(100);
        Assert.assertEquals(117,withMaam,0.00001);
    }
}