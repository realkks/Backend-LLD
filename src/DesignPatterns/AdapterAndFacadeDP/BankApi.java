package DesignPatterns.AdapterAndFacadeDP;

// This is the interface that will be implemented by PhonePe class . It is referenced by PhonePe class
public interface BankApi {
    int checkBalance();
    void moneyTransfer();
}
