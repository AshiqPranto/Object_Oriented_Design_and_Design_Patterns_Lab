package Assignment3;

import java.math.BigDecimal;
import java.util.Hashtable;

public class BankService {
    
    // private Hashtable< int , IAccount> bankAccounts;
    static int accountNumberGenerator = 0;
    private Hashtable<Integer, IAccount> bankAccounts;
    public BankService() {
        this.bankAccounts = new Hashtable<Integer, IAccount>();
    }
    public int createNewAccount(String type, BigDecimal initAmount) 
    {
        IAccount newAccount = null;
        switch (type) {
            case "chequing":
                newAccount = new Chequing(initAmount);
                break;
            case "saving":
                newAccount = new Saving(initAmount);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                break;
            default:
            System.out.println("Invalid account type");
            break;
        }
        if (newAccount != null) 
        {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }
    public void transferMoney(int to, int from, BigDecimal amount)
    {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);
        if(fromAccount.withdraw(amount))
        {
            toAccount.deposit(amount);
            System.out.println("Transfer money successfully, from account " + from + " to " + to);
            return;
        }
        System.out.println("Transfer money failed");
        return;
    }
    public void addMoney(int accountNumber, BigDecimal money){
        IAccount account = this.bankAccounts.get(accountNumber);
        account.deposit(money);
    }
    public void withdrawMoney(int accountNumber, BigDecimal money){
        IAccount account = this.bankAccounts.get(accountNumber);
        account.withdraw(money);
    }
    public void showCurrentBalance(int accountNumber){
        IAccount account = this.bankAccounts.get(accountNumber);
        System.out.println("Current balance for " + accountNumber + " is " + account.getCurrentBalance());
    }
}
