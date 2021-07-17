package Practical3;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(findSmallestIndex(new int[]{1,2,-3,4,0,5,6,7,-88,-9}));
    }

    public static int findSmallestIndex(int[] arr){
        int smallest = 0;
        int smallestIndex = 0;
        for(int i=0;i<arr.length;i++){            
            if(arr[i] <= smallest){                
                smallest = arr[i];  
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
