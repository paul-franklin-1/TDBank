public class BankAccount {
    String firstName;
    String lastName;
    int accountID;
    double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void NOOOOconstructor() {

    }

    public void deposit(double deposit) {
        this.balance += deposit;}

    public void withdrawal(double withdrawal) {
        this.balance -= withdrawal;}
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAccountID(int accountID){
        this.accountID = accountID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAccountID(){
        return this.accountID;
    }

    public double getBalance() {
        return this.balance;
    }

    public void accountSummary() {
        System.out.println("Name: " + this.firstName + " " + this.lastName + "\nAccount ID: " + this.accountID +
                "\nBalance: " + this.balance);}
    }
}