public class CheckingAccount extends BankAccount{
    double interestRate = 5.25;
    public void processWithdrawal(){
        if (this.balance < 0){
            this.balance -= 30;
            System.out.println("Balance: " + this.balance + ". $30 overdraft fee has been applied.");}
        else {System.out.println("Balance: " + this.balance);}}

    public void displayAccount(){
        System.out.println("Name: " + this.firstName + " " + this.lastName + "\nAccount ID: " + this.accountID +
                    "\nBalance: " + this.balance + "\nInterest rate: " + interestRate);}


    }
}
