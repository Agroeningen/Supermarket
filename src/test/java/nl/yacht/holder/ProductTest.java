package nl.yacht.holder;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ProductTest extends TestCase {

    public void testBlikje() {
        //Arrange
        boolean input = false;
        boolean expected = false;
        Product product = new Product("sdf", "sf", "sdf",4.0);

        //Act
        boolean result = product.blikje(input);

        //Assert
        Assert.assertEquals(expected, result);

    }
}