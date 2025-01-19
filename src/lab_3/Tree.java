package lab_3;

public class Tree {
    String name;
    int age;
    boolean livingTree;

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, int age, boolean livingTree) {
        this.name = name;
        this.age = age;
        this.livingTree = livingTree;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void print(){
        System.out.println(name + " " + age + " " + livingTree);
    }
}
