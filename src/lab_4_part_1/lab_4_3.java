package lab_4_part_1;
import java.util.Scanner;

public class lab_4_3 {

        public static boolean printlab_4_3 () {
            System.out.print("Лаб. 4-3: \n"+
                    "Введите первое число:");
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            System.out.print("Введите второе число:");
            int num2 = scanner.nextInt();
            System.out.print("Введите третье число:");
            int num3 = scanner.nextInt();
            return num1 + num2 == num3;  }
}
