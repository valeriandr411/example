package example;

import static java.lang.Math.*;
public class Mathematics {
    //реализовать функцию, которая для данный целых чисел a b c возвращает сумму
    // квадратов двух наибольших из них
    public static int squareMaxSum(int a, int b, int c){
        int maxSum = (int) max(max((pow(a,2)+pow(b,2)),
                (pow(a,2)+pow(c,2))),(pow(b,2)+pow(c,2)));
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println( Mathematics.squareMaxSum(3,2,5));
    }
}
