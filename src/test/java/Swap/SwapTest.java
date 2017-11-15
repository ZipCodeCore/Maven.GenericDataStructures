package Swap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Get the tests passing.
 */
public class SwapTest {
    @Test
    public void testSwap() throws Exception {
        Double[] result = Swap.swap(0,1, 1.5, 2.0,3.0);//Change 2 and 3 to 2.0 and 3.0
        Double[] expected = {2.0, 1.5, 3.0};
        Assert.assertArrayEquals(expected, result);
    }
}