package lab_4_part_2;

import java.util.Scanner;
import java.util.Arrays;

public class lab_4_2 {
    public static void printlab_4_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nЛаб. 4-2 (чвсть 2): \n"+
                "Введите длину массива:");
        int size_arr = scanner.nextInt();
        int[] arr = new int[size_arr];
        for (int i=0; i<size_arr; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива:");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Результат: "+ Arrays.toString(arr));
 /*       for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }*/
    }
}
