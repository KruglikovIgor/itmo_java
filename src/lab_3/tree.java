package lab_3;

public class tree {
    String name;
    int age;
    boolean livingTree;

    public tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public tree(String name, int age, boolean livingTree) {
        this.name = name;
        this.age = age;
        this.livingTree = livingTree;
    }

    public tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void print(){
        System.out.println(name + " " + age + " " + livingTree);
    }
}
