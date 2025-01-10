package lab_4_part_2;

import java.util.Arrays;

public class lab_4_4 {
    public static int printlab_4_4(int[] arr) {
        System.out.println("\nЛаб. 4-4 (чвсть 2):");
        System.out.println("Исходный масив: \t" + Arrays.toString(arr));
        int temp2=0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) { temp++;  }
            }
                if (temp == 1) {
                    temp2=arr[i];
                    break;
                }
       }
        return temp2;
    }
}
