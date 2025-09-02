package BitManipulation;

public class Questions {

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n){
        int count =0;
        while(n>0){
            if((n & 1) !=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExponantion(int a, int n){
        int ans = 1;
        while(n>0){
            if((n & 1)!=0){    // LSB 
                ans= ans*a;  
            }
            a=a*a;
            n= n>>1;
        }
        return ans;
    }
        public static void main(String[] args) {
        System.out.println("power of 2 "+isPowerOfTwo(5));
        System.out.println("count number of set bits "+countSetBits(15));
        System.out.println("fast exponantion "+ fastExponantion(5, 3));
        System.out.println("fast exponantion "+ fastExponantion(3, 5));

    }

}
