package Capgemini_Day9_Methods_Level3;

import java.util.*;
public class OtpGenerator {
    public static void main(String[] args) {
        OtpGenerator generator = new OtpGenerator();
        long[] otp = generator.generateOTP();
        System.out.println("Generated OTP is: ");
        for(int i = 0 ; i < otp.length ; i++){
            System.out.println(otp[i]);
        }
    }
    public long[] generateOTP(){
        long[] otp=new long[10];
        int i=0;
        while(i < 10){
            otp[i] = (long)(Math.random()*9000000000L)+1000000000; // This is for Generating 10-digit OTP
            for(int j = 0 ; j < i ; j++) {
                if(otp[i] == otp[j]){
                    i--;
                    break;
                }
            }
            i++;
        }
        return otp;
    }
}
