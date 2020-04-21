package math;

/**
 * Created by Kaczmarczyk on 2020-04-21.
 */

import org.junit.Assert;
import org.junit.Test;


public class MathAverageTest {

    @Test
    public void testCalculateAverage() {
        //is
        int [] numbers = {1, 2, 3};
        //then
        float average = Math.calculateAverage(numbers);
        //expected
        Assert.assertEquals(2.0, average, 0.01);
    }

}
