package Practical2;

import java.text.DecimalFormat;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(sqrt(2));           
        // System.out.println(round(2.4500001,3));
    }

    public static double sqrt(double num){                
        double lowerLimit,upperLimit,midpoint,midpointSqr;        
        if(num>=1){                   
            lowerLimit = 0;
            upperLimit = num;
            midpoint = upperLimit/2;
            midpointSqr = midpoint*midpoint;        
            while(midpointSqr!=num){                
                if(midpointSqr>num){
                    upperLimit = midpoint;
                }else{
                    lowerLimit = midpoint;
                }                
                midpoint = (upperLimit+lowerLimit)/2;                            
                midpointSqr = midpoint*midpoint;                                     
            }    
            System.out.println(midpoint);
            return midpoint;
        }else{        
            if(num>0){
                upperLimit = 1;
                lowerLimit = num;
                midpoint = upperLimit/2;
                midpointSqr = midpoint*midpoint;  
                while(midpointSqr!=num){                
                    if(midpointSqr>num){
                        upperLimit = midpoint;
                    }else{
                        lowerLimit = midpoint;
                    }                
                    midpoint = (upperLimit+lowerLimit)/2;                            
                    midpointSqr = midpoint*midpoint;                                     
                }    
                System.out.println(midpoint);
                return midpoint;
            }else{       
                System.out.println("Invalid input");         
                return -1;
            }
        }
    }    

    // public static double round(double num, int place){
    //     String numStr = String.format("%."+place+"f", num);
    //     return Double.parseDouble(numStr);
    // }
}
