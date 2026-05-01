package structure;

public class Demo9 {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                break outer;
            }
        }
        System.out.println(0);
    }
}
