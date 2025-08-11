public class q_136 {

    public static int singleNumber(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        return ans;
    }
    
    public static void main(String[] args) {

        int arr[]={4,1,2,1,2};
        int result = singleNumber(arr);
        System.out.println(result);
        
    }
}
