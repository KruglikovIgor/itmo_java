package lab_7;
public class Main
{
    public static void main(String[] args)
    {
        Aircraft suchoiSuperjet = new Aircraft();
        Aircraft.Wing firstWing = suchoiSuperjet.new Wing(993.9);
        Aircraft.Wing secondWing = suchoiSuperjet.new Wing(1119.9);
        firstWing.viewWeight();
        secondWing.viewWeight();
    }
}