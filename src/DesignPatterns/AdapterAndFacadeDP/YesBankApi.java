package DesignPatterns.AdapterAndFacadeDP;

public class YesBankApi {
    public int getBalance(){
        return 1000;
    }
    public void moneyTransfer(){
        System.out.println("Money Transfered");
    }
}
