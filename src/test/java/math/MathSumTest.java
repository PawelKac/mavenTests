package math;

/**
 * Created by Kaczmarczyk on 2020-04-15.
 */

import org.junit.Assert;
import org.junit.Test;


public class MathSumTest {

    @Test
    public void testSum() {
        //is
        int [] numbers = {1, 2, 3};
        //then
        int result = Math.calculateSum(numbers);
        //then
        Assert.assertEquals(6, result);
    }
}
