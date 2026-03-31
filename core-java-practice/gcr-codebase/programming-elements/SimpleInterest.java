import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int rate = sc.nextInt();
        double time = sc.nextInt();
        double simpleInterest = (principle * rate * time) / 100 ;
        System.out.println(simpleInterest);
    }
}
