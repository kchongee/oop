package Practical4;

public class Employee{
    String name;
    double salary;
    Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }
    void raiseSalary(double percent){
        salary = salary + (salary * percent / 100.0);
    }
}