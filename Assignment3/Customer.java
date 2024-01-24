package Assignment3;

import java.math.BigDecimal;

public class Customer {
    public static void main(String args[]) {
    
        BankService myBankService = new BankService();
        
        int myChequing = myBankService.createNewAccount("chequing",
        new BigDecimal(500.00));
    
        myBankService.showCurrentBalance(myChequing);
        myBankService.addMoney(myChequing, new BigDecimal(300.00));
        myBankService.showCurrentBalance(myChequing);
        myBankService.withdrawMoney(myChequing, new BigDecimal(100.00));
        myBankService.showCurrentBalance(myChequing);
        
        // int myInvestment = myBankService.createNewAccount("investment", new BigDecimal(1000.00));
        // myBankService.transferMoney(mySaving, myInvestment, new BigDecimal(300.00));
        int mySaving = myBankService.createNewAccount("saving",
        new BigDecimal(500.00));
        
        myBankService.showCurrentBalance(mySaving);
        myBankService.addMoney(mySaving, new BigDecimal(300.00));
        myBankService.showCurrentBalance(mySaving);
        myBankService.withdrawMoney(mySaving, new BigDecimal(100.00));
        myBankService.showCurrentBalance(mySaving);
        
        
        int myInvestment = myBankService.createNewAccount("investment",
        new BigDecimal(500.00));
    
        myBankService.showCurrentBalance(myInvestment);
        myBankService.addMoney(myInvestment, new BigDecimal(300.00));
        myBankService.showCurrentBalance(myInvestment);
        myBankService.withdrawMoney(myInvestment, new BigDecimal(100.00));
        myBankService.showCurrentBalance(myInvestment);

        
        myBankService.transferMoney(myChequing, mySaving, new BigDecimal(100.00));
    }
    
}
