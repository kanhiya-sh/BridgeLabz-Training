package Capgemini_Day8_Methods_Level2;

import java.util.*;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the age and height of 3 persons: ");
        int age1 = myScan.nextInt();
        double height1 = myScan.nextDouble();
        int age2 = myScan.nextInt();
        double height2 = myScan.nextDouble();
        int age3 = myScan.nextInt();
        double height3 = myScan.nextDouble();

        YoungestAndTallest checker = new YoungestAndTallest();
        double[] ans = checker.check(age1,age2,age3,height1,height2,height3);
        System.out.println("Youngest is "+ ans[0] + " and tallest  is " + ans[1]);
    }
    public double[] check(int age1,int age2,int age3,double height1,double height2,double height3){
        double result[]= new double[2];
        if(age1 <= age2 && age1 <= age3){
            result[0] = 1;
        }
        else if(age2 <= age1 && age2 <= age3){
            result[0] = 2;
        }
        else {
            result[0] = 3;
        }
        if(height1 >= height2 && height1 >= height3){
            result[1] = 1;
        }
        else if(height2 >= height1 && height2 >= height3){
            result[1] = 2;
        }
        else {
            result[1] = 3;
        }
        return result;
    }
}
