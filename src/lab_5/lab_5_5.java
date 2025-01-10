package lab_5;

public class lab_5_5 {
    public static void  printlab_5_5(String str) {
        System.out.println("\nЛаб. 5-5:");
        System.out.println( "The given string is: "+ str);
        System.out.print( "The string reversed word by word is: ");
        String[] words = str.split(" ");
        for (String word : words) {
            StringBuilder builder = new StringBuilder(word);
            builder.reverse();
            System.out.print(builder + " ");
            }
    }
}
