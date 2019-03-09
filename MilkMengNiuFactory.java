package org.study.factory.func;

import org.study.factory.MengNiu;
import org.study.factory.Milk;

/**
 * @Auther: ChenCC
 * @Description:
 */
public class MilkMengNiuFactory implements IFactory{

    @Override
    public Milk getMilk() {
        return new MengNiu();
    }
}
