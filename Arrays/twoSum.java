public class twoSum {
    public static void twoSumArray(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == num){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
       
    }
    public static void main(String[] args) {
        
        int arr[]={3,2,4};
        int target=6;
        twoSumArray(arr, target);

    }
    
}
