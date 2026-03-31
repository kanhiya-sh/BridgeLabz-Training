package Capgemini_Day8_Methods_Level2;

import java.util.*;
public class VoteEligibility {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = myScan.nextInt();
        VoteEligibility checker = new VoteEligibility();
        boolean ans = checker.check(age);
        if(ans){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }
    }
    public boolean check ( int age ) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}
