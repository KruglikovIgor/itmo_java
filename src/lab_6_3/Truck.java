package lab_6_3;

public class Truck extends Car {
    int MaxWeight;
    int CountWheels;

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight)
    {
        super(w, m, c, s);
        this.CountWheels = wheels;
        this.MaxWeight = maxWeight;
    }

    public void newWheels(int value)
    {
        CountWheels = value;
        System.out.println("Новое количество колес: " + CountWheels);
    }
}
