package BitManipulation;

public class oddEven {

    public static int checkOddEven(int n){
        return n & 1;
    }
    public static void main(String[] args) {
        int n=10;
        int result = checkOddEven(n);
        if(result == 1){
            System.out.println("odd number");
        }else{
            System.out.println("even number");
        }

    }
    
}
