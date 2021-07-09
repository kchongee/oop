package Practical2;

public class Q1 {
    public static void main(String[] args) {
        System.out.printf("%s %15s\n","Number","Squareroot");
        for(int i=0;i<=20;i+=2){            
            System.out.printf("%2d %15.4f\n",i,Math.sqrt(i));
        }
    }
}
