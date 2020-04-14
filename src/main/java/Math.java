/**
 * Created by Kaczmarczyk on 2020-04-09.
 */

package math;


    public class Math {



    public static int findMax(int [] numbers) {

        int max = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        }
    }





