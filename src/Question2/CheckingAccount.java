package Question2;

public class CheckingAccount  {
    private double balance;
    private String accountNumber;

    public CheckingAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) throws InsufficientFundsException{
        if (amount <= 0 ){
            throw new InsufficientFundsException(amount);
        }else{
            this.balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException(amount);
        }else{
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getBalance(double amount){
        return this.accountNumber;
    }

}
