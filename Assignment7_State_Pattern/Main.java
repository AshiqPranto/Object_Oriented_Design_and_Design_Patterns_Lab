// package Assignment7_State_Pattern;

public class Main{
    public static void main(String[] args){
        VendingMachine vendingMachine = new VendingMachine(5);
        vendingMachine.insertDolar();
        vendingMachine.insertDolar();
        vendingMachine.ejectMoney();
        vendingMachine.insertDolar();
    }
}
