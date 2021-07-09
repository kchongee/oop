import java.util.Scanner;

public class VendingMachine {
    private CashRegister cashRegister;
    private Dispenser[] dispenser;
  
    public VendingMachine(CashRegister cashRegister, Dispenser[] dispenser) {
  	this.cashRegister = cashRegister;
  	this.dispenser = dispenser;
    }

    public CashRegister getCashRegister() {
        return cashRegister;
    }

    public Dispenser[] getDispenser() {
        return dispenser;
    }

    public void setCashRegister(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }

    public void setDispenser(Dispenser[] dispenser) {
        this.dispenser = dispenser;
    }
  
    public void sellProduct(Dispenser dispenser)
    {
        for(int i=0; i< this.dispenser.length; i++){
            if(this.dispenser[i].compareTo(dispenser) == 0){
                this.dispenser[i].makeSale();
                this.cashRegister.acceptAmount(dispenser.getPrice());
                break;
            }
        }
  
    }

}