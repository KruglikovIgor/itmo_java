package lab_6_2;

public abstract class Human {

    private String firstName;
    private String secondName;

    public Human(String firstName, String secondName)
    {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public void print()
    {
        System.out.println("\nВызывается метод из класса " + this.getClass().getSimpleName());
    }
}