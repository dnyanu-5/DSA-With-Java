package DP;

public class TargetSumSubset {
    static boolean sumSubset(int nums[],int sum){
        int n=nums.length;
        boolean dp[][]=new boolean[n+1][sum+1];

        for(int i=0;i<=n;i++){
            // i=items nums arrays and j= sum
            dp[i][0]=true;   // sum=0
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int v=nums[i-1];
                //valid condition
                if(v<=j && dp[i-1][j-v]==true){
                    dp[i][j]=true;
                }else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        printdp(dp);
        return dp[n][sum];
    }
     public static void printdp(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={4,2,7,1,3};
        int sum=10;
        System.out.println(sumSubset(nums, sum));

    }
    
}
