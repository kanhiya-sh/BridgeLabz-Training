package Capgemini_Day9_Methods_Level3;

public class MatrixManipulation {
    public static void main(String[] args) {
        double[][] matrixTwoByTwo = create(2, 2);
        System.out.println("2x2 Matrix");
        displayMatrix(matrixTwoByTwo);

        System.out.println("\nTranspose");
        displayMatrix(transpose(matrixTwoByTwo));

        System.out.println("\nDeterminant " + determinant2x2(matrixTwoByTwo));

        System.out.println("\nInverse:");
        displayMatrix(inverseTwoByTwo(matrixTwoByTwo));

        double[][] matrixThreeByThree = create(3, 3);
        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrixThreeByThree);
        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrixThreeByThree));
        System.out.println("\nDeterminant: " + determinantThreeByThree(matrixThreeByThree));
        System.out.println("\nInverse:");
        displayMatrix(inverse3By3(matrixThreeByThree));
    }
    public static double[][] create(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10) + 1; // 1–10
            }
        }
        return matrix;
    }
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }
    public static double determinantThreeByThree(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])-m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])+ m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }
    public static double[][] inverseTwoByTwo(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }
    public static double[][] inverse3By3(double[][] m) {
        double det = determinantThreeByThree(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];
        inv[0][0]=  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) /det;
        inv[0][1]= -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2]=  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) /det;
        inv[1][0]= -(m[1][0]*m[2][2] - m[1][2]*m[2][0])/ det;
        inv[1][1]=  (m[0][0]*m[2][2] - m[0][2]*m[2][0])/ det;
        inv[1][2]= -(m[0][0]*m[1][2] - m[0][2]*m[1][0])/ det;
        inv[2][0]=  (m[1][0]*m[2][1] - m[1][1]*m[2][0])/ det;
        inv[2][1]= -(m[0][0]*m[2][1] - m[0][1]*m[2][0])/ det;
        inv[2][2]=  (m[0][0]*m[1][1] - m[0][1]*m[1][0])/ det;

        return transpose(inv); 
    }
    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
