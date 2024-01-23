// package Assignment7_State_Pattern;

public class OutOfStockState implements State{
    @Override
    public void insertDolar(VendingMachine vendingMachine){
        System.out.println("Out Of sTock");
    }
    @Override
    public void ejectMoney(VendingMachine vendingMachine){

    }
    @Override
    public void dispense(VendingMachine vendingMachine){

    }
}