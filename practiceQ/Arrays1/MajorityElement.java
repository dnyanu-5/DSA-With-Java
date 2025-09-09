package practiceQ.Arrays1;

public class MajorityElement {

    public static int solution(int arr[]){

        // int maxCount=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count> arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int arr[]={2,2,3,3,3,3};
        System.out.println(solution(arr));
    }
}
