package math;

/**
 * Created by Kaczmarczyk on 2020-04-09.
 */

import org.junit.Assert;
import org.junit.Test;



public class MathMaxTest {


    @Test
    public void testFindMaxInPositiveNumbers() {
        //is
        int [] numbers = {0, 12, 3, 4, 8, 9, 55, 12, 99, 101};
        //then
        final int result;
        result = Math.findMax(numbers);
        //excepted
        Assert.assertEquals(101, result);
    }

    @Test
    public void testFindMaxInNegativeNumbers() {
        //is
        int [] numbers = {0, -12, -3, 4, 8, 9, -55, 15, -99};
        //then
        final int result;
        result = Math.findMax(numbers);
        //excepted
        Assert.assertEquals(15, result);
    }


}
