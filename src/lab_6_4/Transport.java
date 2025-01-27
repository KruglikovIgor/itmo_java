package lab_6_4;

 import java.util.Scanner;

public class Transport {

    protected int Num=13;

    public void inputNum()
   {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        Num = scanner.nextInt();
    }
}
