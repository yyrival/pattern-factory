package org.study.factory.func;

import org.study.factory.Milk;

/**
 * @Auther: ChenCC
 * @Description:
 */
public interface IFactory {

    Milk getMilk();

    static Milk getTest(){
        return null;
    }

    default Milk getDefault(){
        return null;
    }
}
