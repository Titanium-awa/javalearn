package method;

public class Demo0 {
    public static void main(String[] args) {
        int num0 = add(1, 2);
        System.out.println(num0);
        double num1 = add(1.0, 2);
        System.out.println(num1);
    }
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
}