public class Test {
    public static void main(String[] args) {
        BankAccount paulAccount = new BankAccount();
        paulAccount.setFirstName("Paul");
        paulAccount.setLastName("Franklin");
        paulAccount.setAccountID(12345);
        paulAccount.withdrawal(50);
        paulAccount.accountSummary();

}}