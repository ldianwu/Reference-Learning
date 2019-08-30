package com.lidianwu.reference.test;

import com.lidianwu.reference.utils.MyDate;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * 虚引用测试
 *
 * @author Created by ldianwu on 2019/8/30
 */
public class PhantomReferenceTest {

    public static void main(String[] args) {
        /**
         * 假象引用，在实例化后，就被终止了
         */
        ReferenceQueue queue = new ReferenceQueue();
        PhantomReference ref = new PhantomReference(new MyDate(), queue);
        System.gc();
    }
}
