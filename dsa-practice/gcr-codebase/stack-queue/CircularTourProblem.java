package BridgeLabz_Day24_StackQueue;

import java.util.*;
public class CircularTourProblem {
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        int startIndex = findStartingPoint(petrol, distance);
        System.out.println(startIndex);
    }
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int startingPoint = 0;
        int currentBalance = 0;
        int deficit = 0;
        for (int i = 0; i < petrol.length; i++) {
            currentBalance += petrol[i] - distance[i];
            if (currentBalance < 0) {
                deficit += currentBalance;
                currentBalance = 0;
                startingPoint = i + 1;
            }
        }
        return (currentBalance + deficit >= 0) ? startingPoint : -1;
    }
}
