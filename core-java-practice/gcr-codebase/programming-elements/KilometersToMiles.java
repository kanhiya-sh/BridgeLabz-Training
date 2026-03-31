import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance_in_kilometeres = sc.nextInt();
        double miles = distance_in_kilometeres * 0.621371;
        System.out.println(miles);
    }
}
