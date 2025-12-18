public class CalculateProfitAndLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        int profitPercentage = (profit*100)/costPrice;
        System.out.println("The Cost Price is INR "+costPrice +", Selling Price is INR "+sellingPrice+ "\n"+"The Profit is INR "+profit +", Profit Percentage is "+profitPercentage);

    }
}
