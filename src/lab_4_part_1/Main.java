package lab_4_part_1;

import static lab_4_part_1.lab_4_1.printlab_4_1;
import static lab_4_part_1.lab_4_2.printlab_4_2;
import static lab_4_part_1.lab_4_3.printlab_4_3;
import static lab_4_part_1.lab_4_4.printlab_4_4;
import static lab_4_part_1.lab_4_5.printlab_4_5;
import static lab_4_part_1.lab_4_6.printlab_4_6;

public class Main {
    public static void main(String[] args) {
        printlab_4_1();
        printlab_4_2();
        System.out.println("Результат: "+printlab_4_3());
        System.out.println("Результат: "+printlab_4_4());
        System.out.println("Результат: "+printlab_4_5( 3, -3, 7, 4, 5, 4, 3));
        System.out.println("Результат: "+printlab_4_6( 3, -3, 7, 4, 5, 4, 3));
    }
}
