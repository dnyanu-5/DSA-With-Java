package Recursion;
// basic recursion question
public class q1 {

    public static void decOrder(int n){
        if(n==1){
               System.out.print(n+" ");
                return;
        }
        System.out.print(n+" ");
       decOrder(n-1);
    }

    public static void incOrder(int n){
    //     if(n==10){
    //            System.out.print(n+" ");
    //             return;
    //     }
    //     System.out.print(n+" ");
    //    incOrder(n+1);

        if(n==1){
               System.out.print(n+" ");
                return;
        }
       incOrder(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {

        int n=10;
        decOrder(n);
        System.out.println();
        incOrder(n);

    }
    
}
