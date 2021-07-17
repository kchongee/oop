package Practical3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        while(true){
            try{
                System.out.print("Enter number of quiz scores to process: ");
                int quizNumber = scanner.nextInt();

                System.out.println();
            
                ArrayList<Integer> ScoreArray = new ArrayList<Integer>();            
                for(int i=1;i<=quizNumber;i++){
                    try{
                        System.out.print("Score "+i+": ");                
                        ScoreArray.add(scanner.nextInt());                    
                    }catch (Exception e){
                        i--;
                        System.out.println("Please enter integer only"); 
                        scanner.next(); // or scanner.nextLine();
                    }                
                }                    

                System.out.println();
                System.out.println("Results");
                System.out.println("=======");

                int sum = 0;        
                for(int i=0;i<ScoreArray.size();i++){            
                    sum += ScoreArray.get(i);
                }            
                double average = Math.round((sum / quizNumber));
                System.out.printf("Average is %.1f \n",average);

                int sumAboveOrEqualAvg = 0;
                int sumBelowAvg = 0;
                for(int i=0;i<ScoreArray.size();i++){            
                    int score = ScoreArray.get(i); 
                    if(score >= average){
                        sumAboveOrEqualAvg++;
                    }else{
                        sumBelowAvg++;
                    }                
                }
                System.out.printf("Number of scores above or equal to the average is %d\n",sumAboveOrEqualAvg);
                System.out.printf("Number of scores below the average is %d\n",sumBelowAvg); 

                break;
                                            
            }catch(Exception e){
                System.out.println("Please enter integer only");     
                scanner.next();
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
            }                            
        } 
        
        scanner.close();  
    }    
}
