public class VendingMachine {

    private State currentState;
    private State idleState;
    private State hasADollarState;
    private int count;

    public VendingMachine(int count){
        idleState = new IdleState();
        hasADollarState = new HasADollarState();
        if(count > 0){
            currentState = idleState;
            this.count = count;
        }
        else{
            // currentState = outOfStockState;
            this.count = 0;
        }
    }
    public void setState(State state){
        currentState = state;
    }
    public State getIdleState(){
        return new IdleState() ;
    }
    public State getHasADollarState(){
        return new HasADollarState();
    }
    public State getOutOfStockState(){
        return new OutOfStockState();
    }
    public void insertDolar(){
        currentState.insertDolar(this);
    }
    public void ejectMoney(){
        currentState.ejectMoney(this);
    }
    public void dispense(){
        currentState.dispense(this);
    }
    public void doReleaseProduct(){
        this.count--;
    }
    public int getCount(){
        return count;
    }

}