package com.lidianwu.reference.test;

import com.lidianwu.reference.utils.MyDate;

/**
 * 强引用测试
 *
 * @author Created by ldianwu on 2019/8/30
 */
public class StrongReferenceTest {

    public static void main(String[] args) {
        /**
         * 即使显式调用了垃圾回收，但是用于date是强引用，date没有被回收
         */
        MyDate date = new MyDate();

        System.gc();
    }
}
