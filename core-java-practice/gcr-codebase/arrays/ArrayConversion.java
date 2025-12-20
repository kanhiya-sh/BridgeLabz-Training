

import java.util.Scanner;

public class ArrayConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        // Creating 2D array (matrix)
        int[][] matrix = new int[rows][columns];

        // Taking matrix elements from user
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Creating 1D array
        int[] singleArray = new int[rows * columns];
        int arrayIndex = 0;

        // Copying 2D array elements to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                singleArray[arrayIndex] = matrix[i][j];
                arrayIndex++;
            }
        }

        // Displaying original matrix
        System.out.println("\nOriginal 2D Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Displaying converted 1D array
        System.out.println("\nConverted 1D Array:");
        for (int i = 0; i < singleArray.length; i++) {
            System.out.print(singleArray[i] + " ");
        }
    }
}
