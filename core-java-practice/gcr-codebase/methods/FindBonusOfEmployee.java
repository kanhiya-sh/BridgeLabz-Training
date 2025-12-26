package Capgemini_Day9_Methods_Level3;

public class FindBonusOfEmployee {
    static final int EMPLOYEE_COUNT = 10; // Number of employees
    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();
        System.out.println("Emp  Salary  Years of Service");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println((i + 1) + "\t" + (int) employeeData[i][0] + "\t\t" + (int) employeeData[i][1]);
        }
    }
    public static double[][] generateEmployeeData() {
        double[][] dataEmployee = new double[EMPLOYEE_COUNT][2];
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            // This will Generate 5-digit salary (10000–99999)
            dataEmployee[i][0] = 10000 + (int) (Math.random() * 90000);
            // This will Generate years of service (0–10)
            dataEmployee[i][1] = (int) (Math.random() * 11);
        }
        return dataEmployee;
    }
}
