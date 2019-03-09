package org.study.factory.abst;

import org.study.factory.Milk;

/**
 * @Auther: ChenCC
 * @Description:
 */
public abstract class AbstractMilkFactory {
    abstract Milk getMengNiu();

    abstract Milk getTeLunSu();

    abstract Milk getSanLu();
}
