package company;

public class PartTimePayslip extends Payslip {
  private static double hourlyRate;
  private int hours;

  public PartTimePayslip() {
  }

  public PartTimePayslip(Employee employee) {
    super(employee);
  }

  public PartTimePayslip(Employee employee, int hours) {
    super(employee);
    this.hours = hours;
  }

  public static double getHourlyRate() {
    return hourlyRate;
  }

  public static void setHourlyRate(double hourlyRate) {
    PartTimePayslip.hourlyRate = hourlyRate;
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  @Override
  public double calculateSalary() {
    return hourlyRate * hours;
  }

  @Override
  public String toString() {
    return super.toString() + String.format("\nHours worked: %d\nGross salary: RM%.2f\n",hours, calculateSalary());
  }
}
