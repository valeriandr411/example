package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NegativeTest {
    @DataProvider
    public Object[][] testEqualsNegative() {
        return new Object[][]{
                {"1.0", "2.0", "3.0", new java.lang.NumberFormatException()},
                {"1.0","one", "two", new java.lang.NumberFormatException()},
                {"1","true", "false", new java.lang.NumberFormatException()},
                {"1","s", "m",new java.lang.NumberFormatException()},
                {"1", "one", "1.0", new java.lang.NumberFormatException()},
        };
    }

    @Test(dataProvider = "testEqualsNegative")
    public void testMathOperationNegative(String a, String b, String c, Exception expect) {
        int[] callValues = new int [3];
        try{
            callValues[0] = Integer.parseInt(a);
            callValues[1] = Integer.parseInt(b);
            callValues[2] = Integer.parseInt(c);
            int result = Mathematics.squareMaxSum(callValues[0],callValues[1],callValues[2]);
        }catch (Exception ex){
            assertEquals(ex.getClass().getName(),expect.getClass().getName());
        }
    }
}