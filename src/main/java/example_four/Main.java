package example_four;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //Реализуйте функцию, которая для данного массива возвращает массив только положительных чисел,
    // отсортированных по возрастанию.
    public int[] sortedPositive(int[] array){
        int [] result = array.clone();
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++){
            if(result[i] >= 0){
              return  Arrays.copyOfRange(result,i,result.length);
            }
        }
        return new int[]{};
        }

    public static void main(String[] args) {
        int [] array = new int[]{-3,-1,-10,-11,-25,-13,-78,-199};
        int[] result = new Main().sortedPositive(array);
        System.out.println("Исходный массив после сортировки:");
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println("Результирующий массив:");
        for (int i = 0; i < result.length;i++){
            System.out.println(result[i]);
        }
    }
}
