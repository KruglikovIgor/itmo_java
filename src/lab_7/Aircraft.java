package lab_7;

public class Aircraft
{
    public class Wing
    {
        private double Weight;

        public Wing(double weight)
        {
            this.Weight = weight;
        }

        public void viewWeight()
        {
            System.out.println("Масса крыла: " + Weight + " кг");
        }
    }
}
