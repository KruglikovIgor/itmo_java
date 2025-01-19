package lab_5;

import java.util.Arrays;

public class lab_5_2 {
    public static boolean  printlab_5_2(String str) {
        System.out.println("\nЛаб. 5-2:");
        System.out.println( "Слово: \t"+ str);
        StringBuilder builder = new StringBuilder(str);
        StringBuilder builder2 = builder.reverse();
            if (builder.toString().equalsIgnoreCase(builder2.toString())) return true;
            else return false;
    }
}
