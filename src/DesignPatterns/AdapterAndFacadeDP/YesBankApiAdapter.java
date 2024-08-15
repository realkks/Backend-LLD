package DesignPatterns.AdapterAndFacadeDP;
// This is the adapter class that will be used by PhonePe class to interact with YesBankApi

// This class will implements BankApi interface and will interact with YesBankApi
public class YesBankApiAdapter implements BankApi{
    YesBankApi yesBankApi = new YesBankApi();
    public int checkBalance(){
        return yesBankApi.getBalance();
    }

    @Override
    public void moneyTransfer() {
        yesBankApi.moneyTransfer();
    }
}
