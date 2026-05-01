package basic;

public class Demo2 {
    int num = 114514;
    static int sttNum = 1919810;
    static final String NAME = "hello";

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        int clsNum = demo2.num;
        // System.out.println(this.num);
        System.out.println(clsNum);
        System.out.println(sttNum);
        System.out.println(NAME);
        // NAME = "baba";
    }
}
