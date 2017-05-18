package Swap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by markbrown on 5/18/17.
 */
public class SwapTest {

    @Test
    public void testSwap() throws Exception {
        Double[] result = Swap.swap(0,1, 1.5, 2.0, 3.0);
        Double[] expected = {2.0, 1.5, 3.0};
        Assert.assertArrayEquals(expected, result);
    }

}
