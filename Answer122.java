class Answer122 {
    public static int maxProfit(int[] prices) {
        int value = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1] > prices[i]){
                value += prices[i+1] - prices[i];
            }
        }
    return value;
    }
    public static void main(String[] args){
        int[] array = {1,7,3,1,0};
        System.out.println(maxProfit(array));
    }
}
