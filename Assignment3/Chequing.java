package Assignment3;

import java.math.BigDecimal;

public class Chequing implements IAccount {

    BigDecimal bankAmount;
    int accountNumber;
    public Chequing(BigDecimal initAmount)
    {
        bankAmount = initAmount;
        BankService.accountNumberGenerator++;
        accountNumber = BankService.accountNumberGenerator;
    }
    @Override
    public void deposit(BigDecimal amount) {
        bankAmount = bankAmount.add(amount);
    }

    @Override
    public boolean withdraw(BigDecimal amount) {
        if (bankAmount.compareTo(amount) >= 0) {
            bankAmount = bankAmount.subtract(amount);
            System.out.println("Withdrawal of $" + amount + " successful.");
            return true;
        }
        //else
        System.out.println("Insufficient funds. Withdrawal failed.");
        return false;
    }

    @Override
    public void transfer(BigDecimal amount) {
        
    }

    @Override
    public BigDecimal getCurrentBalance() {
        return bankAmount;
    }
    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
    
}
