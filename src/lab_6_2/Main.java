package lab_6_2;

public class Main {

    public static void main(String[] args) {

        Client client = new Client("Иван", "Иванов", "Альфа-банк");
        Clerk clerk = new Clerk("Петр", "Петров", "Банк ВТБ");

        client.viewFullInfo();
        clerk.viewFullInfo();

    }
}
