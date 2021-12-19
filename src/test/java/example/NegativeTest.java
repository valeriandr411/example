package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NegativeTest {
    @DataProvider
    public Object[][] testEqualsNegative() {
        return new Object[][]{
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 63, 3970},
                {Integer.MAX_VALUE, 0, 0, 1},
                {Integer.MIN_VALUE, 0, 0, 0},
                {Integer.MIN_VALUE, 12, 7, 193}
        };
    }

    @Test(dataProvider = "testEqualsNegative")
    public void testMathOperationNegative(int a, int b, int c, int expect) {
        int result =new Mathematics().squareMaxSum(a,b,c);
        assertEquals(result,expect,"Значения не равны");
    }
}