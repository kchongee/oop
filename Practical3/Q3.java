package Practical3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        

        // int[] denominationArray = {100,50,20,10,5,1};
        // int[] qtyArray = {26,87,96,0,33,145};
        // int total = 0;        
        
        // System.out.printf("%s %10s %10s \n","Denomination(RM)","Quantity","Value(RM)");
        // for(int i=0;i<denominationArray.length;i++){                 
        //     if(denominationArray[i] != 0 && qtyArray[i] != 0){
        //         System.out.printf("%15d %11d %10d \n",denominationArray[i],qtyArray[i],denominationArray[i]*qtyArray[i]);
        //     }               
        //     total += denominationArray[i]*qtyArray[i];
        // }
        // System.out.println("Total: RM "+total);

        int[][] myArray = {{100,26},{50,87},{20,96},{10,0},{5,33},{1,145}};
        int total = 0;      
        
        // Ask the quantity for each denomination
        for(int i=0;i<myArray.length;i++){
            System.out.printf("Quantity for Denomination %d: ",myArray[i][0]);
            myArray[i][1] = scanner.nextInt();
        }

        // To print out the two-dimensional array in grid format
        // method 1
        // make the "printGrid" function to static type
        // method 2 
        // Q3 Question3 = new Q3();
        // Question3.printGrid(myArray);

        
        System.out.printf("%s %10s %10s \n","Denomination(RM)","Quantity","Value(RM)");
        for(int i=0;i<myArray.length;i++){                 
            if(myArray[i][0] != 0 && myArray[i][1] != 0){   
                int subtotal = myArray[i][0]*myArray[i][1];
                System.out.printf("%15d %11d %10d \n",myArray[i][0],myArray[i][1],myArray[i][0]*myArray[i][1]);
                total += subtotal;
            }                                           
        }
        System.out.println("Total: RM "+total);

        scanner.close();
    }

    public void printGrid(int[][] twoDimenArr){
        for(int i = 0; i < twoDimenArr.length; i++)
        {
            for(int j = 0; j < twoDimenArr[i].length ; j++)
            {
                System.out.printf("%5d ", twoDimenArr[i][j]);
            }
            System.out.println();
        }
    }

}
