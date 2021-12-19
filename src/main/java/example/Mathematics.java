package example;

import java.util.Arrays;

public class Mathematics {
    //реализовать функцию, которая для данный целых чисел a b c возвращает сумму
    // квадратов двух наибольших из них
    public int squareMaxSum(int a, int b, int c) {
        int[] list = new int[3];
        list[0] = a;
        list[1] = b;
        list[2] = c;
        Arrays.sort(list);

        int maxOne = list[2];
        int maxTwo = list[1];

        int max = sqr(maxOne)+sqr(maxTwo);

        int maxSum = max(max((sqr(a) + sqr(b)),
                (sqr(a) + sqr(c))), (sqr(b) + sqr(c)));
        return maxSum;
    }

    private int sqr(int c) {
        double pow =  c * c;
        return (int) pow;
    }

    public static void main(String[] args) {
        System.out.println(new Mathematics().squareMaxSum(3, 2, 5));
        System.out.println(new Mathematics().isOverflowsInt(Integer.MIN_VALUE/2));
        int maxInt = (int)Math.sqrt(Integer.MAX_VALUE/2);
        int minInt = - (int)Math.sqrt(Math.abs(Integer.MIN_VALUE/2));
        System.out.println("maxInt = "+maxInt);
        System.out.println("minInt = "+minInt);
        System.out.println(new Mathematics().isOverflowsInt(32767));
        System.out.println(new Mathematics().squareMaxSum(32768,32768,32767));
        System.out.println(new Mathematics().isOverflowsInt(32766));
        System.out.println(new Mathematics().squareMaxSum(32766,32766,32766));
        System.out.println(new Mathematics().isOverflowsInt(-32768));
        System.out.println(new Mathematics().isOverflowsInt(-32767));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }


    private int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
    public boolean isOverflowsInt(int a){
        int maxInt = (int)Math.sqrt(Integer.MAX_VALUE/2);
        int minInt = - (int)Math.sqrt(Math.abs(Integer.MIN_VALUE/2));
        if( a >= maxInt || a <= minInt){
            return true;
        }
        return false;
    }

}
