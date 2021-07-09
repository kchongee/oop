package company;

import java.util.Scanner;

public class ProcessPayroll {

  private Employee[] empArr = new Employee[5];
  Payslip[] payslipArr = new Payslip[empArr.length];

  public void initialize() {
    empArr[0] = new Employee(1001, "Bruce Banner");
    empArr[1] = new FullTimeEmployee(1002, "Steve McQueen", 3500.00, 500.00);
    empArr[2] = new Employee(1003, "Phua Chu Kang");
    empArr[3] = new FullTimeEmployee(1004, "Missy Gold", 8000.00, 1000.00);
    empArr[4] = new FullTimeEmployee(1005, "Ellie Roosevelt", 2000.00, 100.00);
  }

  public void processPayroll() {
    Scanner scn = new Scanner(System.in);
    System.out.println("PAYROLL PROCESSING");
    System.out.println("------------------");
    System.out.print("\nEnter month [1..12]: ");
    int month = scn.nextInt();
    System.out.print("Enter year: ");
    int year = scn.nextInt();
    Payslip.setCalendar(month, year);
    System.out.print("Enter hourly rate for part-timers: ");
    PartTimePayslip.setHourlyRate(scn.nextDouble());

    for (int i = 0; i < payslipArr.length; ++i) {
      System.out.println("\nProcessing payroll for employee #" + (i + 1));
      System.out.println(empArr[i]);
      if (empArr[i] instanceof FullTimeEmployee) {
        System.out.println("Employee type: FULL TIME");
        payslipArr[i] = new FullTimePayslip((FullTimeEmployee) empArr[i]);
        payslipArr[i].calculateSalary();
        System.out.print("Enter mode of contribution, [1] Volunteer or [2] Donation: ");
        int selection = scn.nextInt();
        switch (selection) {
          case 1:
            ((FullTimePayslip) (payslipArr[i])).volunteer();
            break;
          case 2:
            System.out.print("Enter amount to donate: RM");
            double donation = scn.nextDouble();
            ((FullTimePayslip) (payslipArr[i])).donate(donation);
            break;
        }
      } else {
        System.out.println("Employee type: PART TIME");
        payslipArr[i] = new PartTimePayslip(empArr[i]);
        System.out.print("Enter hours worked: ");
        ((PartTimePayslip)(payslipArr[i])).setHours(scn.nextInt());
      }
    }
  }

  public void displayPayslips() {
    System.out.println("\n\nGENERATING PAYSLIPS FOR " + Payslip.getMonthAndYear());
    System.out.println("------------------------------------------");

    for (int i = 0; i < payslipArr.length; ++i) {
      System.out.println("\nEmployee #" + (i + 1) + "\n" + payslipArr[i]);
    }
  }

  public ProcessPayroll() {
    initialize();
    processPayroll();
    displayPayslips();
  }

  public static void main(String[] args) {
    new ProcessPayroll();
  }
}
