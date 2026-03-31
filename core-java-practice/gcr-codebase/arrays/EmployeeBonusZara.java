

import java.util.*;

public class EmployeeBonusZara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] oldSalary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmount = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Salary for Employee " + (i + 1) + ": ");
            double sInput = sc.nextDouble();
            System.out.print("Enter Years of Service for Employee " + (i + 1) + ": ");
            double yInput = sc.nextDouble();

            if (sInput < 0 || yInput < 0) {
                System.out.println("Invalid input");
                i--;
            } else {
                oldSalary[i] = sInput;
                yearsOfService[i] = yInput;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = oldSalary[i] * 0.05;
            } else {
                bonusAmount[i] = oldSalary[i] * 0.02;
            }

            newSalary[i] = oldSalary[i] + bonusAmount[i];

            totalOldSalary += oldSalary[i];
            totalBonus += bonusAmount[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
