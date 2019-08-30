package com.lidianwu.reference;

import com.lidianwu.reference.utils.MyDate;

/**
 * 情况二：显式调用垃圾回收
 *
 * @author Created by ldianwu on 2019/8/30
 */
public class ExplicitGarbageRetrieve {

    public static void main(String[] args) {
        /**
         * 显示调用gc进行垃圾回收
         */
        MyDate date = new MyDate();
        date = null;

        System.gc();
    }
}
