package BitManipulation;

public class bitOperations {

    public static int getIthbit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask )== 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static int setIthbit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int clearIthbit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthbit(int n, int i,int newBit) {
    //    if(newBit==0){
    //     return clearIthbit(n, i);
    //    }else{
    //     return setIthbit(n, i);
    //    }

       int num = clearIthbit(n, i);
       int bitmask = newBit << i;
       return num | bitmask;
    }

    public static int clearIBit(int n,int i){

        int bitmask= (-1)<<i;  
        // or ~(0) << i
        return n & bitmask;

    }

    public static int clearBitsInRange(int n,int i,int j){
        int a= ((~0)<<j+1);
        int b= ((1<<i)-1);
        int bitmask= a|b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println("the I th bit is "+getIthbit(10, 3));
        System.out.println("the I th bit is "+getIthbit(8, 2));
        System.out.println("setting I th bit is "+setIthbit(10, 2));
        System.out.println("clear I th bit is "+clearIthbit(10, 1));
        System.out.println("update I th bit "+updateIthbit(10, 1,1));
        System.out.println("update I th bit "+updateIthbit(10, 1,0));
        System.out.println("clear I no. of bit "+clearIBit(15,2));
        System.out.println("clear I no. of bit "+clearIBit(10,2));
        System.out.println("clear bits in range "+ clearBitsInRange(10, 2, 4));

    }

}
