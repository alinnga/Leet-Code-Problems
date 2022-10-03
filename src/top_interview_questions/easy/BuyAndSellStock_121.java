package top_interview_questions.easy;

public class BuyAndSellStock_121 {
    public static void main(String[] args) {
        int maxProfit = maxProfit(new int[]{2, 4, 1});
        System.out.println();
    }
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < lowestPrice) {
                lowestPrice = price;
            } else if (price - lowestPrice > maxProfit) {
                maxProfit = price - lowestPrice;
            }
        }
        return maxProfit;
    }
}
