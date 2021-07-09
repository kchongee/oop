import Practical2.Average;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World!"+2);
        
        max();        
        System.out.printf("average of number 1,2,3 is: %.2f",Average.calculateAverage(1, 2, 3));
    }

    public static void max(){
        int upA = (int)'A';
        int upZ = (int)'Z';
        int lowA = (int)'a';
        int lowZ = (int)'z';
        // System.out.println(upA);
        // System.out.println(lowZ);
        char randUpChar = (char)(upA+(Math.random()*(upZ-upA+1)));
        char randLowChar = (char)(lowA+(Math.random()*(lowZ-lowA+1)));
        System.out.println(randUpChar);
        System.out.println(randLowChar);
    }
}