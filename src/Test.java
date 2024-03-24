public class Test {
    public static void main(String[] args) {
        CheckingAccount johnAccount = new CheckingAccount();
        johnAccount.setFirstName("John");
        johnAccount.setLastName("Doe");
        johnAccount.setAccountID(54321);
        johnAccount.deposit(5000);
        johnAccount.withdrawal(1000);

        CheckingAccount paulAccount = new CheckingAccount();
        paulAccount.setFirstName("Paul");
        paulAccount.setLastName("Franklin");
        paulAccount.setAccountID(12345);
        paulAccount.deposit(1000);
        paulAccount.withdrawal(300);

        System.out.println("Account information for \"paulAccount\":");
        paulAccount.getFirstName();
        paulAccount.getLastName();
        paulAccount.getAccountID();
        paulAccount.getBalance();

        System.out.println();

        CheckingAccount emptyAccount = new CheckingAccount();
        System.out.println("Account information for \"emptyAccount\":");
        emptyAccount.getBalance();

    }}

