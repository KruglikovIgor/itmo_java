package lab_6_2;

public class Client extends Human implements IFullInfo
{
    private String BankName;

    public Client(String firstname, String secondname, String bankname) {
        super(firstname, secondname);
        this.BankName = bankname;
    }

    public void viewFullInfo() {

        print();
        System.out.println("Имя: " + getFirstName());
        System.out.println("Фамилия: " + getSecondName());
        System.out.println("Название банка: " + BankName);
    }
}