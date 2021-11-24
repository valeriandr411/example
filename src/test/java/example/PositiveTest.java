package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PositiveTest {
    @DataProvider
    public Object[][]testEquals() {
        return new Object[][]{
                {1, 2, 3, 13},
                {3, 3, 3, 18},
                {0, 0, 0, 0},
                {-125, 13, 63, 19594},
                {-12, 8, -13, 313},
        };
    }
    @Test(dataProvider = "testEquals")
    public void testMathOperation(int a, int b, int c, int expect) {
        int result =new Mathematics().squareMaxSum(a,b,c);
        assertEquals(result,expect);
    }


}