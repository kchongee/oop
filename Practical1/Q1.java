package Practical1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Q1 {
    public static void main(String[] args) {
        // <--- CMD version --->
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter name: ");
        // String name = sc.nextLine();
        // // System.out.println("\n");

        // System.out.print("Enter your year of study: ");
        // int year = sc.nextInt();
        // // System.out.println("\n");

        // System.out.print("What is your target GPA for this semester? ");
        // double gpa = sc.nextDouble();
        // // System.out.println("\n");

        // System.out.printf("Welcome %s \n", name);
        // System.out.printf("Work hard to achieve your target GPA of %.2f this semester of your Year %d \n", gpa, year);

        // sc.close();


        // <--- GUI version --->
        // JOptionPane pane = new JOptionPane();
        String name = JOptionPane.showInputDialog(null,"Enter you name: ","Practical1 Input",JOptionPane.PLAIN_MESSAGE);

        String yearString = JOptionPane.showInputDialog(null, "Enter your year of study: ","Practical1 Input",JOptionPane.INFORMATION_MESSAGE);
        int year = Integer.parseInt(yearString);

        String gpaString = JOptionPane.showInputDialog(null, "What is your target GPA for this semester? ","Practical1 Input",JOptionPane.INFORMATION_MESSAGE);
        double gpa = Double.parseDouble(gpaString);
        
        String messageBox = String.format("Welcome %s. \nWork hard to achieve your target GPA of %.2f this semester of your Year %d.",name,gpa,year);
        JOptionPane.showMessageDialog(null, messageBox , "Practical1 Output", JOptionPane.ERROR_MESSAGE);
            
    }
}
