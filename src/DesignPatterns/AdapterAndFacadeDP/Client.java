package DesignPatterns.AdapterAndFacadeDP;

public class Client {
    public static void main(String[] args) {
        //PhonePe phonePe = new PhonePe(new YesBankApi());    // Tightly couples on YesBankApi

        // Creating object of YesBankApiAdapter class and passing it to PhonePe class
        BankApi bankApi = new YesBankApiAdapter();
        PhonePe phonePe = new PhonePe(bankApi);    // Loosely couples on YesBankAPi and IciciBankApi
    }
}
