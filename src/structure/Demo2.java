package structure;

public class Demo2 {
    public static void main(String[] args) {
        // 为什么会case穿透
        final char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println('A');
            case 'B':
                System.out.println('B');
            case 'C':
                System.out.println('C');
            case 'D':
                System.out.println('D');
        }
    }
}
