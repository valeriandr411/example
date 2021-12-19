package example_two;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MainTest {
    @DataProvider
    public Object[][] dpToBinaryTest(){
        return  new Object[][]{
                {4,"100"},
                {0,"0"},
                {Integer.MAX_VALUE,Integer.toBinaryString(Integer.MAX_VALUE)},

        };
    }
    @Test(dataProvider = "dpToBinaryTest")
    public void toBinaryTest(int number,String expected) throws ToBinaryException{
        String actual = new Main().toBinary(number);
        Assert.assertEquals(actual,expected,"Значения не равны");
    }
    @DataProvider
    public Object[][] dpToBinaryTestNegative(){
        return  new Object[][]{
                {-1},
                {Integer.MIN_VALUE},

        };
    }

    @Test(dataProvider = "dpToBinaryTestNegative", expectedExceptions = ToBinaryException.class)
    public void toBinaryTestNegative(int number) throws ToBinaryException{
        new Main().toBinary(number);

    }
    @Test(dataProvider = "dpToBinaryTestNegative", expectedExceptionsMessageRegExp = "")
    public void toBinaryTestNegativeTwo(int number) throws ToBinaryException{
        new Main().toBinary(number);

    }

}