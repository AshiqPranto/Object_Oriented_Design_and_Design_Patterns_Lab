// package Assignment7_State_Pattern;

public class HasADollarState implements State{
    @Override
    public void insertDolar(VendingMachine vendingMachine){
        System.out.println("Dollar already inserted");
    }
    @Override
    public void ejectMoney(VendingMachine vendingMachine){
        System.out.println("Returning money from HasADollarState");
        vendingMachine.setState(vendingMachine.getIdleState());
    }
    @Override
    public void dispense(VendingMachine vendingMachine){
        System.out.println("Releasing product");
        if (vendingMachine.getCount() > 1) {
            vendingMachine.doReleaseProduct();
            vendingMachine.setState(vendingMachine.getIdleState());
        } 
        else {
            vendingMachine.doReleaseProduct();
            vendingMachine.setState(vendingMachine.getOutOfStockState());
        }
    }
}
