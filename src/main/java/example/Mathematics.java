package example;


public class Mathematics {
    //реализовать функцию, которая для данный целых чисел a b c возвращает сумму
    // квадратов двух наибольших из них
    public int squareMaxSum(int a, int b, int c) {
        int maxSum = max(max((sqr(a) + sqr(b)),
                (sqr(a) + sqr(c))), (sqr(b) + sqr(c)));
        return maxSum;
    }

    private int sqr(int c) {
        double pow =  c * c;
        return (int) pow;
    }

    public static void main(String[] args) {
       // Mathematics mathematics = new Mathematics();
        //System.out.println(mathematics.squareMaxSum(3, 2, 5));
        System.out.println(Integer.MAX_VALUE );
        int sum = 12*12+7*7;
        System.out.println(sum);

    }


    private int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

}
