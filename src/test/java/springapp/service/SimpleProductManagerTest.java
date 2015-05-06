package springapp.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleProductManagerTest {
    private SimpleProductManager simpleProductManager;

    @Before
    public void before() {
        simpleProductManager = new SimpleProductManager();
    }

    @Test
    public void testGetProductsWithNoProducts() {
        assertNull(simpleProductManager.getProduct());
    }

}
