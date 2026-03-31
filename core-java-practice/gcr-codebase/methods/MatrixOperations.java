package Capgemini_Day9_Methods_Level3;

public class MatrixOperations {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] matrixA = createMatrix(rows, columns);
        int[][] matrixB = createMatrix(rows, columns);

        System.out.println("Matrix A");
        display(matrixA);
        System.out.println("\nMatrix B");
        display(matrixB);
        System.out.println("\nAddition");
        display(add(matrixA, matrixB));
        System.out.println("\nSubtraction");
        display(subtract(matrixA, matrixB));
        System.out.println("\nMultiplication");
        display(multiply(matrixA, matrixB));
    }
    public static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                matrix[i][j]= (int) (Math.random() * 10); // values between 0–9
            }
        }
        return matrix;
    }

    // Addition of two matrices
    public static int[][] add(int[][] matrixA, int[][] matrixB) {
        int rows =matrixA.length;
        int columns=matrixA[0].length;
        int[][] result= new int[rows][columns];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                result[i][j]=matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Subtraction of two matrices
    public static int[][] subtract(int[][] matrixA, int[][] matrixB) {
        int rows=matrixA.length;
        int columns=matrixA[0].length;
        int[][] result=new int[rows][columns];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                result[i][j]=matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }
    // Multiplication of two matrices
    public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int rows =matrixA.length;
        int columns=matrixB[0].length;
        int common =matrixB.length;
        int[][] result = new int[rows][columns];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
    public static void display(int[][] matrix) {
        for (int i= 0; i < matrix.length; i++) {
            for (int j= 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
