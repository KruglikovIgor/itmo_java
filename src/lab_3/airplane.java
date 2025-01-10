package lab_3;

public class airplane {
    String name;
    String color;
    double weight;

    @Override
    public String toString() {
        return "airplane{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void print(){
        System.out.println(name + " " + color + " " + weight);
    }

    public airplane() {
    }

    public airplane(String color) {
        this.color = color;
    }

    public airplane(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public airplane(String name,  String color, double weight) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
}
