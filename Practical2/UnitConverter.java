package Practical2;
public class UnitConverter {
    public static void main(String[] args) {
        //print inch to cm
        System.out.printf("%8s %18s\n","Inches","Centimeter");
        for(double i=1;i<=10;i++){            
            System.out.printf("%8.2f %15.2f\n",i,inchToCentimeter(i));
        }

        System.out.println();

        //print cm to inch   
        System.out.printf("%11s %14s\n","Centimeter","Inches");
        for(double i=5;i<=50;i+=5){            
            System.out.printf("%9.2f %15.2f\n",i,centimeterToInch(i));
        }
    }

    public static double inchToCentimeter(double inch){
        return inch * 2.54;
    }

    public static double centimeterToInch(double cm){
        return cm / 2.54;
    }
}
