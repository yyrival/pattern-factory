package org.study.factory.simple;

import org.study.factory.Milk;

/**
 * @Auther: ChenCC
 * @Date: 2018/12/29 0029 22
 * @Description:
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();

        Milk m = factory.getMilk("TeLunSu");
        System.out.println(m.getName());
    }
}
