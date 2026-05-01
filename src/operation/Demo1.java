package operation;

public class Demo1 {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        System.out.println((a != 1) && (a++ != 1));

        System.out.println(a == b);
    }
}
