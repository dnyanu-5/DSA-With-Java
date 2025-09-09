package practiceQ.Arrays1;
// finding the majority element in an array
public class Boyre_MooreAlgo {

    public static int majorityElement(int[] nums) {
        int candiadate=-1;
        int count =0;
        for(int num :nums){
            if(count==0){
                candiadate=num;
                count++;
            }else if(num==candiadate){
                count++;
            }else{
                count--;
            }
        }
       count = 0;
        for (int num : nums) {
            if (num == candiadate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candiadate;
        }

        return -1; 
    }

    public static void main(String[] args) {
        int nums[]={2,1,3,3,3,3};
        System.out.println(majorityElement(nums));
    }
}
