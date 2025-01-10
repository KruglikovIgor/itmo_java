package lab_4_part_2;

public class lab_4_1 {
    public static boolean printlab_4_1(int... arr) {
        System.out.println( "\nЛаб. 4-1 (чвсть 2):");
        boolean res = true;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1])   res=false;
        }
        if (res) {System.out.println("OK");}
        else {System.out.println("Please, try again");}
        return res;
    }
}
