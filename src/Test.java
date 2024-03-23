public class Test {
    public static void main(String[] args) {
        CheckingAccount paulAccount = new CheckingAccount();
        paulAccount.setFirstName("Paul");
        paulAccount.setLastName("Franklin");
        paulAccount.setAccountID(99999);
        paulAccount.deposit(1000);
        paulAccount.processWithdrawal(3000);
        paulAccount.getAccountID();
        paulAccount.accountSummary();
}}