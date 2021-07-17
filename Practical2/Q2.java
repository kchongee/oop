package Practical2;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.crypto.spec.DESKeySpec;

public class Q2 {
    public static void main(String[] args) {                      
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Please enter a number: ");
            double num = scanner.nextDouble();            

            System.out.println(Math.sqrt(num));
            System.out.printf("%.8f",sqrt(num));
        }catch(Exception InputMismatchException){
            System.out.println("Please enter only a number!");
        }    

        scanner.close();
    }    
    public static Double sqrt(double num){                
        double lowerLimit,upperLimit,midpoint,midpointSqr;        
        if(num>=1){                   
            lowerLimit = 0;
            upperLimit = num;
            midpoint = upperLimit/2;
            midpointSqr = midpoint*midpoint;  
            return findMidpoint(lowerLimit, upperLimit, midpoint, midpointSqr, num);
        }else{        
            if(num>0){
                upperLimit = 1;
                lowerLimit = num;
                midpoint = upperLimit/2;
                midpointSqr = midpoint*midpoint;                  
                return findMidpoint(lowerLimit, upperLimit, midpoint, midpointSqr, num);
            }else{       
                System.out.println("Invalid input, negative number doesn't have any square root");         
                return null;
            }
        }
    }    

    public static double round(double value, int places){        
        double scale = Math.pow(10,places);        
        return Math.round(value*scale)/scale;
        // System.out.println(value);
        // String valueString = Double.toString(value);
        // String[] digitAfterDecimalPoint = valueString.split("\\.");
        // String eightDigitsAfterDecimalPoaint = "";
        // for(int i=0;i<8;i++){
        //     eightDigitsAfterDecimalPoaint += digitAfterDecimalPoint[1].charAt(i);
        // }
        // System.out.println(digitAfterDecimalPoint[0]+"."+eightDigitsAfterDecimalPoaint);
        // return value;
    }

    public static double findMidpoint(double lowerLimit, double upperLimit, double midpoint, double midpointSqr, double num){
        while(round(midpointSqr,8)!=num){                
            if(midpointSqr>num){
                upperLimit = midpoint;
            }else{
                lowerLimit = midpoint;
            }                
            midpoint = (upperLimit+lowerLimit)/2;                            
            midpointSqr = midpoint*midpoint;                
        }            
        // DecimalFormat dmFormat = new DecimalFormat("##0.00000000");        
        // double formattedMidpoint = Double.parseDouble(dmFormat.format(midpoint));
        // System.out.println(formattedMidpoint);        

        // System.out.println(round(midpoint-0e-8,8));
        return round(midpoint,8);
    }
}
