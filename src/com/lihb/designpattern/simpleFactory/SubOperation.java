package com.lihb.designpattern.simpleFactory;

/**
 * 类说明：
 *
 * @author Administrator
 * @version 1.0
 * @date 2015/6/9
 */

public class SubOperation extends Operation{

    @Override
    public double getResult() {
        return oper_numA - oper_numB;
    }
}
