package BridgeLabz_Day27_LinearBinarySearch;

public class StringBufferConcatenate {
    public static void main(String[] args) {
        String[] arr = {"Hello", " ", "From", " ", "Java"};
        StringBuffer sb = new StringBuffer();
        for (String str : arr) {
            sb.append(str);
        }
        System.out.println("Concatenated String is : " + sb.toString());
    }
}
