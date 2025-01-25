package lab_6_1;

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
        System.out.println("\nMethod from " + this.getClass().getSimpleName() + " class");
    }

    public abstract void viewFullInfo();
}
