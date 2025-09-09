package practiceQ.Arrays1;

public class SingleNumber {

    public static int solution(int arr[]){
        int result=0;
        for(int n:arr){
            // result=result ^ n;
            result^= n;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        System.out.println(solution(arr));
    }
    
}
