package structure;

public class Demo4 {
    public static void main(String[] args) {
        // 高斯碾压同学属于是
        final int minNum = 1;
        final int maxNum = 100;
        final int count = 100;

        System.out.println(method1(minNum, maxNum, count));
        System.out.println(method2(minNum, maxNum, count));
    }

    public static int method1(int minNum, int maxNum, int count) {
        return (minNum + maxNum) * count / 2;
    }

    public static int method2(int minNum, int maxNum, int count) {
        int sum = 0;
        int tolerance = (maxNum - minNum) / (count - 1);  // 仅当能整除时正确
        for (int i = 0; i < count; i++) {
            sum += minNum + i  * tolerance;
        }
        return sum;
    }
}