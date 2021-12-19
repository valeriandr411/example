package example_two;
//Реализуйте функцию, возвращающую двоичное представление числа n(n>=0). Например, 101 - это
// двоичное представление числа. Метод должен иметь сигнатуру String toBinary(int number)
public class Main {
    public String toBinary(int number) throws ToBinaryException {
        if(number < 0 ){
            throw new ToBinaryException("Число меньше нуля!");
        }
        if(number == 0){
            return "0";
        }
        int remainder = 0;
        StringBuilder result = new StringBuilder();
        while (number != 0 ) {

            remainder = number % 2;
            result.append(remainder);
            number = number/2;
        }
        result.reverse();

        return result.toString();
    }
}
