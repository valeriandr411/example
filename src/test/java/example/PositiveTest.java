package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PositiveTest {
    @DataProvider
    public Object[][]testEquals() {
        return new Object[][]{
                {"1", "2", "3", 13},
                {"3", "3", "3", 18},
                {"0", "1", "2", 5},
                {"0", "0", "0", 0},
                {"12", "13", "13", 338},
                {"125", "13", "63", 19594},
                {"-12", "8", "-13", 313},

                //граничные значения:
                {"2147483647", "2147483647", "63", Integer.MAX_VALUE},
                {"2147483647", "0", "0", Integer.MAX_VALUE},
                {"-2147483648", "0", "0", Integer.MAX_VALUE},
                {"-2147483648", "12", "7", Integer.MAX_VALUE}
        };
    }
    @Test(dataProvider = "testEquals")
    public void testMathOperation(String a, String b, String c, int expect) {
        int[] callValues = new int [3];
        callValues[0] = Integer.parseInt(a);
        callValues[1] = Integer.parseInt(b);
        callValues[2] = Integer.parseInt(c);
        int result = Mathematics.squareMaxSum(callValues[0],callValues[1],callValues[2]);
        assertEquals(result,expect);
    }


}