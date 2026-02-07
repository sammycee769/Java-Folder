package AccountPackage;

public class Account {

    private int balance;
    private int pin;

    public Account (int pin){
        this.pin = pin;
    }
    private boolean verifyPin(int pin) {
        return this.pin==pin;
    }

    public void deposit(int amount){
        if(amount > 0) {
            balance = balance + amount;
        }
    }

    public int checkBalance(int pin) {
        if(!verifyPin(pin)){
            return -1 ;
        }
        return balance;
    }


    public int withdraw(int amount, int pin) {
        if(!verifyPin(pin)){
            return -2;
        }
        if(amount > balance) {
            return balance;
        }
        else if(amount > 0) {
        balance = balance - amount;
        }
        return balance;
    }
}
