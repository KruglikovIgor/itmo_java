package lab_4_part_2;

import java.util.Arrays;

import static lab_4_part_2.lab_4_1.printlab_4_1;
import static lab_4_part_2.lab_4_2.printlab_4_2;
import static lab_4_part_2.lab_4_3.printlab_4_3;
import static lab_4_part_2.lab_4_4.printlab_4_4;

public class Main {
    public static void main(String[] args) {
        printlab_4_1(3, -3, 7, 4, 5, 4, 6);
        printlab_4_2();
        int[] array = {3, -3, 7, 4, 5, 4, 6};
        printlab_4_3(array);
 //       printlab_4_4(array);
        System.out.println("Первое уникальное число в массиве : "+printlab_4_4(array));
    }
}
