public class Test {
    public static void main(String[] args) {
        CheckingAccount paulAccount = new CheckingAccount();
        paulAccount.setFirstName("Paul");
        paulAccount.setLastName("Franklin");
        paulAccount.setAccountID(12345);
        paulAccount.deposit(1000);
        paulAccount.withdrawal(50);
        paulAccount.processWithdrawal(70);
        paulAccount.deposit(200);
        paulAccount.getBalance();
        paulAccount.getAccountID();

}}