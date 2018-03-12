package Swap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Get the tests passing.
 */
public class SwapTest {
    @Test
    public void testSwap() throws Exception {
        Integer[] result = Swap.swap(0,1, 50, 2,3);
        Integer[] expected = {2, 50, 3};
        Assert.assertArrayEquals(expected, result);
    }
}