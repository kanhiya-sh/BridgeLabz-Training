

import java.util.Scanner;

public class FindYoungestAndTallestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays for age and height
        int[] age = new int[3];
        int[] height = new int[3];

        // Taking input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            age[i] = sc.nextInt();

            System.out.println("Enter height of " + names[i] + ":");
            height[i] = sc.nextInt();
        }

        // Find youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println(names[youngestIndex] + " is the youngest");
        System.out.println(names[tallestIndex] + " is the tallest");
    }
}
