package BridgeLabz_Day27_LinearBinarySearch;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
        int n = 1_000_000;
        StringBuffer sbuffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbuffer.append("hello");
        }
        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;
        StringBuilder sbuilder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbuilder.append("hello");
        }
        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;
        System.out.println("StringBuffer Time is : " + timeBuffer + " ns");
        System.out.println("StringBuilder Time is : " + timeBuilder + " ns");
    }
}
