package company;

public class FullTimeEmployee extends Employee {
  private double basicSalary;
  private double allowance;

  public FullTimeEmployee() {
  }

  public FullTimeEmployee(int id, String name, double basicSalary, double allowance) {
    super(id, name);
    this.basicSalary = basicSalary;
    this.allowance = allowance;
  }

  public double getAllowance() {
    return allowance;
  }

  public void setAllowance(double allowance) {
    this.allowance = allowance;
  }

  public double getBasicSalary() {
    return basicSalary;
  }

  public void setBasicSalary(double basicSalary) {
    this.basicSalary = basicSalary;
  }

  @Override
  public String toString() {
    return super.toString() + String.format("\nBasic Salary: %.2f\nAllowance: %.2f", basicSalary, allowance);
  }


}
