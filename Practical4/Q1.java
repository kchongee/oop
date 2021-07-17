package Practical4;

public class Q1 {
    public static void main(String[] args) {
        Employee empA = new Employee("Question A",3000);
        System.out.printf("Salary before raise %.2f",empA.salary);
        empA.raiseSalary(8);
        System.out.printf("Salary before raise %.2f",empA.salary);
    }
}   
