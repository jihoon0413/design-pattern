package org.example.design_pattern._6_prototype.ex_program;

import org.example.design_pattern._6_prototype.ex_program.framework.Manager;
import org.example.design_pattern._6_prototype.ex_program.framework.Product;

public class Main {
    public static void main(String[] args) {
        // TODO Cloneable 인터페이스 공부하기
        // 준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        // 등록
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 생성과 사용
        Product p1 = manager.create("strong message");
        p1.use("Hello, world");

        Product p2 = manager.create("warning box");
        p2.use("Hello, world");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world");
    }
}
