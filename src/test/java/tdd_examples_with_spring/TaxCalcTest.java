package tdd_examples_with_spring;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Evgeny Borisov
 */
public class TaxCalcTest {

    private SpringMaamResolver mock;
    private TaxCalc taxCalc;

    @Before
    public void setUp() throws Exception {
        taxCalc = new TaxCalc();
        mock = Mockito.mock(SpringMaamResolver.class);
        Mockito.when(mock.getMaam()).thenReturn(0.1);
        taxCalc.setMaamResolver(mock);
    }

    @Test(expected = IllegalStateException.class)
    public void illegalStateExceptionShouldHappenWhenNegativeValueBlablabla() {
        taxCalc.withMaam(-199);
    }

    @Test
    public void withMaam() {

        Assert.assertEquals(taxCalc.withMaam(100), 110, 0.00001);

    }
}

