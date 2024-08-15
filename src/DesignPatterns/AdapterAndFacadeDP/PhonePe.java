package DesignPatterns.AdapterAndFacadeDP;

public class PhonePe implements BankApi{
//    //YesBankApi yesBankApi ;
//    public PhonePe(YesBankApi yesBankApi){
//        this.yesBankApi = yesBankApi;
//    }

    BankApi bankApi;

    // Receiving BankApi object as parameter
    PhonePe(BankApi bankApi){
        this.bankApi = bankApi;
    }
    public int checkBalance(){
        return bankApi.checkBalance();
    }

    @Override
    public void moneyTransfer() {
        bankApi.moneyTransfer();
    }
}
