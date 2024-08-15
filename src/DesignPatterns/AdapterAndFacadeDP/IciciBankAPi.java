package DesignPatterns.AdapterAndFacadeDP;

public class IciciBankAPi {
    public int FindBalance(){
        return 1000;
    }
    public void transferMoney(){
        System.out.println("Money Transfered");
    }
}
