package com.ding.resource.utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class lambda_test {

    public static void main(String[] args) {
        lambd_b();
    }

    public static void lambd_a() {

        /**
         * lambda表达式的基本结构
         * (param1,param2,...,param3) -> {执行体...}
         */
        JFrame jfram = new JFrame("My farm");
        JButton jButton = new JButton("My button");
        jButton.addActionListener((ActionEvent e) -> System.out.println("button replaced"));
        jfram.add(jButton);
        jfram.pack();
        jfram.setVisible(true);
        jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void lambd_b() {

        /**
         * 函数式接口：有且只有一个抽象方法
         * functional interfaces can be created with
         * lambda expressions, method references, or constructor references
         */
        //摒弃之前的for循环,使用匿名函数
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        integerList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        //更进一步
        integerList.forEach(e -> System.out.println(e));

        //继续
        integerList.forEach(System.out::println);

    }
}
