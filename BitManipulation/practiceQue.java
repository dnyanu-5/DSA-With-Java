package BitManipulation;
public class practiceQue {
    public static void main(String[] args) {
        //1. x^x for any value of x
        int a=6;
        System.out.println(a ^ a);

        //2 swap two numbers
        int x=5;int y=4;
        System.out.println("x="+x +","+"y="+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x="+x +","+"y="+y);

        // add 1 to one integer
       System.out.println("adding one to an integer: "+ -~a);

       //convert uppercase to lowercase
       
       for(char ch='A';ch<='Z';ch++){
        System.out.print((char)(ch | ' ')+" ");
       }


    }
}
