package JavaStepByStep;

public class Account {
    Person accountHolder;
    double amountAvailable;
    double interest;
    static double rate = 2.0;

    public void transaction(double amount){
        if(amount<0 && amountAvailable+amount<0 )
            System.out.println("Money is not enough");
        else
            amountAvailable+=amount;
    }

    public void calculateMoney(){
        interest=interest+amountAvailable*rate/100/365;
    }

    public void deposit(){
        amountAvailable = amountAvailable+interest;
        interest=0;
    }
}
