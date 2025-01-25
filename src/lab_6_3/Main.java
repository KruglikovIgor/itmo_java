package lab_6_3;

public class Main
{
    public static void main(String[] args)
    {
        Truck truck = new Truck(16000, "KAMAZ-65201-49", 'W', 90, 8, 49000);
        truck.outPut();
        truck.newWheels(6);
    }
}