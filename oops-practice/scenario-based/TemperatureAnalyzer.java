package Capgemini_Day16_ScenarioBased;
import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        float[][] temp = new float[7][24];
        float[] dailyAverage = new float[7];
        float hottestTemp = 0.0f;
        int hottestDay = -1;
        float coldestTemp = Float.MAX_VALUE;
        int coldestDay = -1;
        float sum = 0.0f;
        System.out.println("Enter temperatures for 7 days (24 values each) : ");
        for(int i = 0; i < 7; i++){
            System.out.println("Day " + (i + 1) + " : ");
            for(int j = 0; j < 24; j++){
                temp[i][j] = myScan.nextFloat();
                sum += temp[i][j];
                if(temp[i][j] > hottestTemp){
                    hottestTemp = temp[i][j];
                    hottestDay = i+1;
                }
                if(temp[i][j] < coldestTemp){
                    coldestTemp = temp[i][j];
                    coldestDay = i+1;
                }
            }
            dailyAverage[i] = sum / 24;
            sum = 0.0f;
        }
        System.out.println("Daily Averages are :");
        for(int i = 0; i < 7; i++){
            System.out.println("Day " + (i + 1) + " : " + dailyAverage[i]);
        }
        System.out.println("Hottest Temperature: " + hottestTemp + " is on Day " + hottestDay);
        System.out.println("Coldest Temperature: " + coldestTemp + " is on Day " + coldestDay);
    }
}
