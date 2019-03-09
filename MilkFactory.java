package org.study.factory.abst;

import org.study.factory.MengNiu;
import org.study.factory.Milk;
import org.study.factory.SanLu;
import org.study.factory.TeLunSu;

/**
 * @Auther: ChenCC
 * @Description:
 */
public class MilkFactory extends AbstractMilkFactory {
    @Override
    Milk getMengNiu() {
        return new MengNiu();
    }

    @Override
    Milk getTeLunSu() {
        return new TeLunSu();
    }

    @Override
    Milk getSanLu() {
        return new SanLu();
    }
}
