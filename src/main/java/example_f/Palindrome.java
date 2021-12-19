package example_f;

import java.util.Locale;

public class Palindrome {
/*    Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
    Палиндромом называется строка, которая читается одинаково слева направо
    и справа налево (в том числе пустая). При определении "палиндромности" строки должны
    учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов
    должны игнорироваться. Гарантируется, что в метод попадают только строки, состоящие из
    символов ASCII (цифры, латинские буквы, знаки препинания).
    Т.е. русских, китайских и прочих экзотических символов в строке не будет.
    */

    public boolean isPalindrome(String input){
        if(input == null){
            throw new IllegalArgumentException();
        }

        String resStr = input.replace(" ","")
                .replaceAll("\\W","")
                .toLowerCase(Locale.ROOT);
        if(resStr.isEmpty()){
            return true;
        }

        char[] result = resStr.toCharArray();
        char[] invertArr = new char[result.length];
        int j =0;
        for(int i = result.length-1; i>=0;i--){
            invertArr[j] = result[i];
            j++;
        }

        for (int i = 0; i<result.length;i++){
            if(invertArr[i] != result[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Anna";
        System.out.println(input+":"+new Palindrome().isPalindrome(input));
        input = "  ";
        System.out.println(input+":"+new Palindrome().isPalindrome(input));
        input = "Kjf k";
        System.out.println(input+":"+new Palindrome().isPalindrome(input));
        input = "123321";
        System.out.println(input+":"+new Palindrome().isPalindrome(input));
        input = "madam i'm adam";
        System.out.println(input+":"+new Palindrome().isPalindrome(input));
        input = null;
        System.out.println(input+":"+new Palindrome().isPalindrome(input));
    }

}
