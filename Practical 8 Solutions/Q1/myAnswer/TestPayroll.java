package A;

import java.util.Scanner;

public class TestPayroll {

  public static void processPayroll(Payslip[] payslips) {
    Scanner scn = new Scanner(System.in);
    System.out.println("PAYROLL PROCESSING");
    System.out.println("------------------");
    
    for (int i = 0; i < payslips.length; ++i) {
      System.out.println("\nProcessing payroll for employee #" + (i + 1));
      System.out.println(payslips[i].getEmployee());
      
       if (payslips[i] instanceof FullTimePayslip) {
        System.out.print("Enter mode of contribution, [1] Volunteer or [2] Donation: ");

        int selection = scn.nextInt();

        switch (selection) {
          case 1:
            ((FullTimePayslip) (payslips[i])).volunteer();
            break;
          case 2:
            System.out.print("Enter amount to donate: RM ");
            double donation = scn.nextDouble();
            ((FullTimePayslip) (payslips[i])).donate(donation);
            break;
        }
      } 
    }
  }

  public static void displayPayslips(Payslip[] payslips) {
    System.out.println("\n\nGENERATING PAYSLIPS FOR " + Payslip.getMonthAndYear());
    System.out.println("------------------------------------------");

    for (int i = 0; i < payslips.length; ++i) {
      System.out.println("\nEmployee #" + (i + 1) + "\n" + payslips[i]);
    }
  }

  public static void main(String[] args) {
      Payslip[] payslipArr = { new FullTimePayslip(new Employee(100, "ALex" ), 2500, 500),
                               new FullTimePayslip(new Employee(101, "John" ), 5000, 800),
                               new PartTimePayslip(new Employee(103, "Stella"), 20),
                              };
   
      processPayroll(payslipArr);
      displayPayslips(payslipArr);

      System.out.println("\nTotal donation  : " + FullTimePayslip.getDonationFund());
      System.out.println("Total volunteer : " + FullTimePayslip.getVolunteerCount());
  }
}
