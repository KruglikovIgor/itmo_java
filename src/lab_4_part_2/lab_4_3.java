package lab_4_part_2;

import java.util.Arrays;

public class lab_4_3 {
    public static void printlab_4_3(int[] arr) {
        System.out.println( "\nЛаб. 4-3 (чвсть 2):");
        System.out.println( "Исходный масив: \t"+ Arrays.toString(arr));
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.println( "Измененный массив: \t"+ Arrays.toString(arr));
    }
}
