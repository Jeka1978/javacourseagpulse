package home_made_singleton;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculatorTest {

    @Test
    public void withMaam() {

        MaamResolver maamResolverMock = Mockito.mock(MaamResolver.class);

        Mockito.when(maamResolverMock.getMaam()).thenReturn(0.17);




        TaxCalculator taxCalculator = new TaxCalculator(maamResolverMock);
        double answer = taxCalculator.withMaam(100);
        Assert.assertEquals(117,answer,0.000001);
    }
}