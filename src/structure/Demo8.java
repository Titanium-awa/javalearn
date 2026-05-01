package structure;

public class Demo8 {
    public static void main(String[] args) {
        int i = 0;

        while (true) {
            if (i > 114514) {
                break;
            }
            System.out.println(i);
            i++;
        }

        i = 1;
        while (i <= 114514){
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
