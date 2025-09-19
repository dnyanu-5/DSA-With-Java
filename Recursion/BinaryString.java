package Recursion;

public class BinaryString {

    public static void solution(int n, int last, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }
        solution(n - 1, 0, str+"0");
        if (last == 0) {
            solution(n - 1, 1, str+"1");
        }
    }

    public static void solution0(int n, int last, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // always can place '1'
        solution0(n - 1, 1, str + "1");

        // place '0' only if last was not 0
        if (last != 0) {
            solution0(n - 1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        System.out.println("without consecutive 1");
        solution(3, 0, "");
        System.out.println("without consecutive 0");
        solution0(3, 1, "");

    }

}
