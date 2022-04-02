public class BuyAndSellStockOne {
    static int maxProfit(int[] prices) {
        int mp = 0, s = prices[0];
        for (int p : prices) {
            s = Math.min(p, s);
            mp = Math.max(mp, p - s);
        }
        return mp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(maxProfit(arr));
    }
}
