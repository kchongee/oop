package Practical1;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder strbuild = new StringBuilder();

        System.out.println("Please enter an 8-digit number,");
        String cardNumStr = scanner.nextLine();        
        cardNumStr = cardNumStr.replaceAll("\\s", "");

        if(cardNumStr.length()==8){
            strbuild.append(cardNumStr);
            strbuild.reverse();
            
            int cardNum = Integer.parseInt(cardNumStr);
            // String reversedCardNumStr =  strbuild.toString();        
            // int reversedCardNum = Integer.parseInt(reversedCardNumStr);
            int step1Sum = 0;
            List<Integer> step2 = new ArrayList<Integer>();
            int step2Sum = 0;
                
            for(int i=0;cardNum>0;i++){ 
                // System.out.println(cardNum);               
                if(i%2==0){                    
                    step1Sum += cardNum%10;
                }else{
                    int num = cardNum%10*2;
                    while(num>0){
                        step2.add(num%10);
                        num/=10;
                    }                                        
                }
                cardNum/=10;
                // System.out.println(cardNum+" sec");
            }

            Iterator<Integer> step2Iterator = step2.iterator();
            while(step2Iterator.hasNext()){                
                step2Sum += step2Iterator.next();
            }
            
            if((step1Sum+step2Sum)%10==0){
                System.out.println("Credit Card number is valid!");
            }else{
                System.out.println("Credit Card number is not valid!");
            }
        }else{
            System.out.println("Credit Card number is not valid!");
        }            

        scanner.close();
    }
}
