package Practical1;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Q2 {
    public static void main(String[] args) {
        // <--- CMD version --->
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your age(years): ");
        // int AGE = scanner.nextInt();        

        // System.out.printf("Age in years: %d years \n", AGE);
        // System.out.printf("Age in days: %d days \n", AGE*365*24);
        // System.out.printf("Age in seconds: %d seconds \n", AGE*365*24*60*60);

        // scanner.close();     
        
        // <--- GUI version --->                
        while (true){            
            String ageString = JOptionPane.showInputDialog(null, "Enter your age(years): ", "Prompt Dialog", JOptionPane.INFORMATION_MESSAGE);
            try {                    
                int age = Integer.parseInt(ageString);                
                String message = String.format("Age in years: %d years \nAge in days: %d days \nAge in seconds: %d seconds \n", age, age*365, age*365*24*60*60);
                JOptionPane.showMessageDialog(null, message, "My Result" , JOptionPane.INFORMATION_MESSAGE);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input! \nPlease enter number(s) only", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }     
        }        
    }
}
