package lab_3;

public class Main {
    public static void main(String[] args) {
        System.out.print("Лаб. 3-1: \n");
        study study = new study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        System.out.print("\n"+"Лаб. 3-2: ");
        airplane airplane1 = new airplane("Boeing","white",162.9);
        airplane airplane2 = new airplane("Airbus","silver",201.5);
        airplane1.print();
        airplane2.print();

        System.out.print("\n"+"Лаб. 3-3: \n");
        house house1=new house();
        house house2=new house();
        house1.setValue("House_1",5,1896);
        house2.setValue("House_2", 17, 2017);
        house1.print();
        house2.print();
        System.out.println(house1.yearPassed());
        System.out.println(house2.yearPassed());

        System.out.print("\n"+"Лаб. 3-4: \n");
        tree tree1=new tree("oak",96);
        tree tree2=new tree("sequoia",112,true);
        tree tree3=new tree();
    }
}
