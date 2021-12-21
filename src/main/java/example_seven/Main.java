package example_seven;

public class Main {
    //Реализуйте функцию, которая для заданного числа (int) печатает
    //«foo», если это число делится на 3 без остатка,
    // печатает «bar», если это число делится на 5 без остатка, печатает «foobar», если это число делится на
    // 15 без остатка, печатает само число в остальных случаях.

    public void meth(Integer number) {
        if (number == null) {
            throw new IllegalArgumentException("Число не может быть null");
        }
        if (number % 3 == 0) {
            System.out.print("foo");
        }
        if (number % 5 == 0) {
            System.out.print("bar");
        } else if (number % 3 != 0) {
            System.out.print(number);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Main().meth(3);
        new Main().meth(5);
        new Main().meth(15);
        new Main().meth(8);
        new Main().meth(0);
        new Main().meth(Integer.MAX_VALUE);
        new Main().meth(Integer.MIN_VALUE);
        new Main().meth(null);
    }
}
