package org.study.factory.func;

import org.study.factory.Milk;

/**
 * @Auther: ChenCC
 * @Description:
 */
public class MilkFactoryTest {
    public static void main(String[] args) { 
        MilkMengNiuFactory factory = new MilkMengNiuFactory();

        Milk m = factory.getMilk();

        System.out.println(m.getName());
    }
}
