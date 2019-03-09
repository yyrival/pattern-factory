package org.study.factory.simple;

import org.study.factory.MengNiu;
import org.study.factory.Milk;
import org.study.factory.SanLu;
import org.study.factory.TeLunSu;

/**
 * @Auther: ChenCC
 * @Date: 2018/12/29 0029 22
 * @Description:
 */
public class SimpleFactory {

    public Milk getMilk(String name){
        if("SanLu".equals(name)){
            return new SanLu();
        }
        if("TeLunSu".equals(name)){
            return new TeLunSu();
        }
        if("MengNiu".equals(name)){
            return new MengNiu();
        }

        return null;
    }

}
