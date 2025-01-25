package lab_6_5;

public class Kid extends Human {

    String Name;

    @Override
    public void inputAge()
    {
        System.out.print("Class Kid.\nВведите имя пользователя: ");
        Name = scanner.nextLine();
        System.out.println("Имя пользователя: " + Name);
    }
}
