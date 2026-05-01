package io;

import java.util.Scanner;

public class Demo0 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("姓名: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                name = "匿名用户";
            }
            System.out.println("你好, " + name + "!");
        }
    }
}