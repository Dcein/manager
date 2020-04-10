package com.ding.common.vo;

import com.ding.common.vo.user.User;
import lombok.Data;
import lombok.ToString;

/**
 * @program: manager
 * @description:
 * @author: DingCong
 * @create: 2018-12-07 11:28
 **/
public class Test {


    @Data
    static class Person {

        private String name;

        {
            System.out.println("代码块");
        }

        static {
            System.out.println("静态代码块");
        }

        Person() {
            System.out.println("无参方法");
        }

        Person(String name) {
            System.out.println("有参构造：" + name);
        }

        private static void persion(String sex){

            System.out.println(sex);
        }




    }


    public static void main(String[] args) {

       User user = new User();
        System.out.println(user);




    }
}
