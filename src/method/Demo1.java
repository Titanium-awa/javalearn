package method;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            String nameAlias;
            switch (compare(a, b)) {
                case -1: nameAlias = "小于"; break;
                case 1: nameAlias = "大于"; break;
                case 0: nameAlias = "等于";  break;
                default: nameAlias = "无法比较"; break;
            }
            System.out.println(a + nameAlias + b);
        }

        sc.close();
    }

    public static int compare(double a, double b) {
        if (a == b) return 0;
        if (a < b) return -1;
        return 1;
    }
}
