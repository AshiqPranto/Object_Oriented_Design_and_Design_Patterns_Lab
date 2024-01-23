public class IdleState implements State{
    @Override
    public void insertDolar(VendingMachine vendingMachine){
        System.out.println("A dollar has inserted");
        vendingMachine.setState(vendingMachine.getHasADollarState());
    }
    @Override
    public void ejectMoney(VendingMachine vendingMachine){
        System.out.println(" No money to return in IdleState");
    }
    @Override
    public void dispense(VendingMachine vendingMachine){
        System.out.println("Payment required in IdleState");
    }
}