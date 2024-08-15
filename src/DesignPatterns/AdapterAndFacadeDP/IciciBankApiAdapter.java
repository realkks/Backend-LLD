package DesignPatterns.AdapterAndFacadeDP;

// This class will be used by PhonePe class to interact with IciciBankApi

// This class will implements BankApi interface and will interact with IciciBankApi

public class IciciBankApiAdapter implements BankApi {
    IciciBankAPi iciciBankAPi = new IciciBankAPi();
    public int checkBalance(){
        return iciciBankAPi.FindBalance();
    }

    @Override
    public void moneyTransfer() {
        iciciBankAPi.transferMoney();
    }
}
