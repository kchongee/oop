
import java.util.Scanner;

public class TestVendingMachine {

    static VendingMachine vendingMachine;
    static Scanner input = new Scanner(System.in);

    public static void initialize() {
        CashRegister cashRegister = new CashRegister(500.00);

        Dispenser cola = new Dispenser("Coca-Cola", 5, 2.00);
        Dispenser sprite = new Dispenser("Sprite", 1, 1.50);
        Dispenser grape = new Dispenser("Grape", 100, 1.80);
        Dispenser orange = new Dispenser("Orange", 10, 2.00);

        Dispenser[] dispenserArr = {cola, sprite, grape, orange};

        vendingMachine = new VendingMachine(cashRegister, dispenserArr);
    }

    public static void displayMenu() {
        System.out.println("\n=====Drink Vending Machine=====");
        System.out.println("\nEnter number (1 - 4) to select an item :-");

        Dispenser[] dispenserList = vendingMachine.getDispenser();
        for (int i = 0; i < dispenserList.length; ++i) {
            System.out.print((i + 1) + " - " + dispenserList[i].getDrink());

            if (dispenserList[i].soldOut()) {
                System.out.print(" [SOLD OUT]");
            }

            System.out.println();
        }
        System.out.print("9 - Exit\nEnter selection: ");
    }

    public static void sellProduct(int drinkSelection) {
        Dispenser selectedDispenser = vendingMachine.getDispenser()[drinkSelection - 1];

        double balanceAmount = selectedDispenser.getPrice();
        double totalAmountEntered = 0;
        
        while (balanceAmount > 0) {
            System.out.printf("Please insert RM%.2f\nAmount tendered: RM ", balanceAmount);
            double amountEntered = input.nextDouble();
            totalAmountEntered += amountEntered;
            balanceAmount -= amountEntered;
        }
        if(balanceAmount <0){
           System.out.println("Balance :  RM " + balanceAmount); 
        }
        
        System.out.println();
        vendingMachine.sellProduct(selectedDispenser);
        System.out.println("Collect your drink and enjoy...");
    }

    public static void main(String[] args) {
        initialize();
        int choice;

        do {

            displayMenu();
            choice = input.nextInt();

            if (choice >= 1 && choice <= vendingMachine.getDispenser().length) {

                Dispenser selectedDispenser = vendingMachine.getDispenser()[choice - 1];

                if (selectedDispenser.soldOut()) {
                    System.out.println("This item is SOLD OUT.");
                } else {
                    sellProduct(choice);
                }
            } else if (choice != 9) {
                System.out.println("Invalid input.");
            }

        } while (choice != 9);

    }
}
