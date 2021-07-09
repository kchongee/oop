package company;

public class FullTimePayslip extends Payslip implements Contributor {

  private double monthlySalary;
  private char contribution; // 'V'olunteer or 'D'onation
  private static double donationFund = 0.0;
  private static int volunteerCount = 0;

  public FullTimePayslip(FullTimeEmployee employee) {
    super(employee);
    monthlySalary = calculateSalary();
  }

  public FullTimePayslip(Employee employee, char contribution) {
    super(employee);
    monthlySalary = calculateSalary();
    this.contribution = contribution;
  }

  public double getMonthlySalary() {
    return monthlySalary;
  }

  public char getContribution() {
    return contribution;
  }

  public void setContribution(char contribution) {
    this.contribution = contribution;
  }

  public static double getDonationFund() {
    return donationFund;
  }

  public static int getVolunteerCount() {
    return volunteerCount;
  }

  public void donate(double amount) {
    donationFund += amount;
    contribution = 'D';
    monthlySalary -= amount;
  }

  public void volunteer() {
    volunteerCount++;
    contribution = 'V';
  }

  @Override
  public double calculateSalary() {
    FullTimeEmployee e = (FullTimeEmployee)(getEmployee());
    return e.getBasicSalary() + e.getAllowance();
  }

  @Override
  public String toString() {
    FullTimeEmployee e = (FullTimeEmployee)(getEmployee());
    return super.toString() + String.format("\nGross salary: RM%.2f\nContribution: %s\nMonthly Salary: RM%.2f\n",
            calculateSalary(), (contribution == 'D' ? "Donation" : "Volunteer"), monthlySalary);
  }
}
