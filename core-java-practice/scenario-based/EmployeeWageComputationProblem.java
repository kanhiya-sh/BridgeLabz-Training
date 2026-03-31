package scenarioBased;

public class EmployeeWageComputationProblem {
	
	public static final int PART_TIME_EMPLOYEE = 1; 
    public static final int FULL_TIME_EMPLOYEE = 2;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int wagePerHour = 20;

        int maxWorkingDays = 20;  
        int maxWorkingHours = 100; 

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        while (totalWorkingDays < maxWorkingDays &&
               totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int isPresent = (int) (Math.random() * 3);
            int employeeHours = 0;

            switch (isPresent) {
                case FULL_TIME_EMPLOYEE:
                    employeeHours = 8;
                    System.out.println("Day " + totalWorkingDays + ": Full Time Employee");
                    break;

                case PART_TIME_EMPLOYEE:
                    employeeHours = 4;
                    System.out.println("Day " + totalWorkingDays + ": Part Time Employee");
                    break;

                default:
                    employeeHours = 0;
                    System.out.println("Day " + totalWorkingDays + ": Employee Absent");
            }

            totalWorkingHours += employeeHours;
            int dailyWage = employeeHours * wagePerHour;
            totalWage += dailyWage;

            System.out.println("Daily Wage: " + dailyWage);
            System.out.println();
        }

        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Employee Wage: " + totalWage);
    }
}
