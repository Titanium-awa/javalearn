package structure;

import java.util.Scanner;

public class Demo0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入成绩: ");

        if (sc.hasNextInt()) {
            int score = sc.nextInt(); // 输入得分

            if (score < 0 || score > 100) {
                System.out.println("输入数据超出范围!");
            } else if (score == 100) {
                System.out.println("恭喜满分!");
            } else if (score >= 80) {
                System.out.println("优秀!");
            }else if (score >= 60) {
                System.out.println("及格!");
            } else {
                System.out.println("不及格!");
            }
        } else {
            System.out.println("您输入的不是整数!");
        }

        sc.close();
    }
}