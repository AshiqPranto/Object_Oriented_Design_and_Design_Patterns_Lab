package Assignment3;

import java.math.BigDecimal;

public interface IAccount {
    public void deposit(BigDecimal amount);
    public boolean withdraw(BigDecimal amount);
    public void transfer(BigDecimal amount);
    public BigDecimal getCurrentBalance();
    public int getAccountNumber();
}
