package BridgeLabz_Day39_FunctionalInterfaces;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> checker = s -> s.length();
        System.out.println(checker.apply("Hello World"));
    }
}
