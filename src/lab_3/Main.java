package lab_3;

public class Main {
    public static void main(String[] args) {
        System.out.print("Лаб. 3-1: \n");
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        System.out.print("\n"+"Лаб. 3-2: ");
        Airplane airplane1 = new Airplane("Boeing","white",162.9);
        Airplane airplane2 = new Airplane("Airbus","silver",201.5);
        airplane1.print();
        airplane2.print();

        System.out.print("\n"+"Лаб. 3-3: \n");
        House house1=new House();
        House house2=new House();
        house1.setValue("House_1",5,1896);
        house2.setValue("House_2", 17, 2017);
        house1.print();
        house2.print();
        System.out.println(house1.yearPassed());
        System.out.println(house2.yearPassed());

        System.out.print("\n"+"Лаб. 3-4: \n");
        Tree tree1=new Tree("oak",96);
        Tree tree2=new Tree("sequoia",112,true);
        Tree tree3=new Tree();
    }
}
