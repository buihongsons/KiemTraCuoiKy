public class _1672_Richest_Customer_Wealth {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int [] arr = new int[accounts.length];
            int sum =0;
            for(int row = 0;row<accounts.length;row++){
                for(int col = 0;col<accounts[row].length;col++){
                    sum = sum + accounts[row][col];
                }
                arr[row]=sum;
                sum = 0;
            }
            int max = arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            return max;
        }
    }
}
