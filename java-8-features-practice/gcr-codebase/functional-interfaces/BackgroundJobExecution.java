package BridgeLabz_Day39_FunctionalInterfaces;

public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Background Job Running");
        new Thread(r).start();
    }
}
