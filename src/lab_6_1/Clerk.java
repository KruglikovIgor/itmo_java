package lab_6_1;

public class Clerk extends Human {

    private String BankName;

    public Clerk(String firstname, String secondname, String bankname) {
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
