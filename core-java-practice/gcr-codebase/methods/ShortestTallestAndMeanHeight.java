package Capgemini_Day9_Methods_Level3;

public class ShortestTallestAndMeanHeight {
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // for getting random height between 150 and 250
        }
        ShortestTallestAndMeanHeight calculator = new ShortestTallestAndMeanHeight();
        int sum = calculator.calculateSum(heights);
        double mean = calculator.calculateMean(sum, heights.length);
        int shortest = calculator.findShortest(heights);
        int tallest = calculator.findTallest(heights);
        System.out.println("Heights: ");
        for (int height : heights) {
            System.out.println(height + " ");
        }
        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
    public int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public double calculateMean(int sum, int numberOfElements) {
        return (double) sum / numberOfElements;
    }
    public int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    public int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
