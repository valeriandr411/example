package example_three;

import java.util.ArrayList;

public class Main {
    //Дан массив целых чисел. Написать функцию, возвращающую массив всех неуникальных значений исходного массива.
    // Пример: {5, 10, 5, 3, 10, 10, 1}->{5, 10, 5, 10, 10}

    public int[] nonUniqueElements(int[] array) {
        ArrayList<Integer> listElements = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j != i && array[j] == array[i]) {
                    listElements.add(array[j]);
                    break;
                }
            }
        }
        return listElements.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] array = new Main().nonUniqueElements(new int[]{5, 10, 5, 3, 10, 10, 1});
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
