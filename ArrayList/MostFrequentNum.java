package ArrayList;
import java.util.ArrayList;

public class MostFrequentNum {

    public static int mostTargetNumber(ArrayList<Integer> nums , int key){

        int n= nums.size();
        int arr[] = new int[1000];

        for(int i=0;i<n-1;i++){
            if(nums.get(i) == key){
                arr[nums.get(i+1)]++;
            }
        }
        int max=0;
        int ans=0;
        for(int i=0;i<1000;i++){
            if(arr[i] > max){
                max= arr[i];
                ans = i ;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> nums = new ArrayList<>(); 
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        int key = 2;

        System.out.println(mostTargetNumber(nums, key));

    }
    
}
