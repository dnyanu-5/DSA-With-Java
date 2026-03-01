import java.util.*;

public class practceFile {

    public static int solution(int stalls[],int c){
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[stalls.length-1]-stalls[0];
        int d=0;

        while(low<=high){
            int mid= low+(high-low)/2;

            if(isValid(stalls,c,mid)){
                low=mid+1;
                d=mid;
            }else{
                high=mid-1;
            }
        }
        return d;
    }
    public static boolean isValid(int stalls[],int c,int mid){
        int cow=1;
        int lastPos=0;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-stalls[lastPos] >=mid){
                cow++;
                lastPos=i;
            }
        }
        return cow==c;
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,8,4,9};
        int c=3;
        System.out.println(solution(arr, c));

    }
}
