package lab_4_part_1;

public class lab_4_2 {
    public static void printlab_4_2()    {
        System.out.println( "\nЛаб. 4-2:");

        System.out.println("Делится на 3: ");
        for (int i=1; i<101; i++) {
                if (i%3==0)
                System.out.print(i +" ");
        }
        System.out.println("\n");
        System.out.println("Делится на 5: ");
        for (int i=1; i<101; i++) {
                if (i%5==0)
                System.out.print(i +" ");
        }
        System.out.println("\n");
        System.out.println("Делится на 3 и на 5: ");
        for (int i=1; i<100; i++) {
                if (i%3==0 && i%5==0)
                System.out.print(i +" ");
        }
        System.out.println("\n");
    }
}
