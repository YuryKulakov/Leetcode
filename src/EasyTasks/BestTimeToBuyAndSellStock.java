package EasyTasks;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(array));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int num : prices) {
            min = Math.min(min, num);
            maxProfit = Math.max(maxProfit, num - min);
        }
        return maxProfit;
    }
}
