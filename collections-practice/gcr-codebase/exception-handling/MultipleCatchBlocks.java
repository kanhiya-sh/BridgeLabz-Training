package BridgeLabz_Day32_ExceptionHandling;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            int idx = 5;
            System.out.println("Value at index : " + idx + ": " + arr[idx]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
