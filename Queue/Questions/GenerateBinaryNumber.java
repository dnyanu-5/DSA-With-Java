package Queue.Questions;
import java.util.*;

public class GenerateBinaryNumber {

    public static void BinaryNumber(int n){
        Queue<String> q= new LinkedList<>();
        q.add("1");
        while(n--> 0){
            String s1= q.peek();
            q.remove();
            System.out.println(s1);
            q.add(s1+"0");
            q.add(s1+"1");
        }
    }
    public static void main(String[] args) {
        int n=5;
        BinaryNumber(n); 
    }
}
