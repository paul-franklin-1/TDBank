public class BankAccount {
    String firstName;
    String lastName;
    int accountID;
    double balance;

    public BankAccount() {
        this.balance = 0;
    }
    public void deposit(double deposit) {
        this.balance += deposit;}

    public void withdrawal(double withdrawal) {
    if ((this.balance - withdrawal)<0){
        System.out.println("Error: Negative balance not permitted.");}
    else{this.balance -= withdrawal;}
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAccountID(int accountID){
        this.accountID = accountID;
    }
    public void getFirstName(){
        System.out.println("First Name: " + this.firstName);
    }
    public void getLastName(){
        System.out.println("Last Name: " + this.lastName;
    }
    public void getAccountID(){
        System.out.println("Account ID: " + this.accountID);
    }
    public void getBalance() {
        System.out.println(String.format("Balance: $%.2f", this.balance));
    }
    public void accountSummary() {
        System.out.println(String.format("Name: " + this.firstName + " " + this.lastName + "\nAccount ID: " + this.accountID +
                "\nBalance: $%.2f", this.balance));}
    }
