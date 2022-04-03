public class BuyAndSellStockTwo {
    static int maxProfit(int[] prices) {
        int mp = 0;
        for (int i = 0; i < (prices.length - 1); i++) {
            if (prices[i + 1] > prices[i]) {
                mp += prices[i + 1] - prices[i];
            }
        }
        return mp;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
