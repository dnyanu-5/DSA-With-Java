
public class q_238 {
    public static int[] exists(int nums[]){
        int n=nums.length;
        int result[]=new int[n];

        for(int i=0;i<n;i++){
            result[i]=1;
        }
        int leftProduct=1;
        int rightproduct=1;

        for(int i=0;i<n;i++){
            result[i]=leftProduct;
            leftProduct*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            result[i]*=rightproduct;
            rightproduct*=nums[i];
        }
        return result;
    }
    public static void main(String[] args) {

        int nums[]={1,2,3,4};
        int ans[]= exists(nums);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
    
}
