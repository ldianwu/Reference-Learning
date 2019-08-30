package com.lidianwu.reference.test;

import com.lidianwu.reference.utils.MyDate;

import java.lang.ref.WeakReference;

/**
 * 弱引用测试
 *
 * @author Created by ldianwu on 2019/8/30
 */
public class WeakReferenceTest {

    public static void main(String[] args) {
        /**
         * 在JVM垃圾回收运行时，弱引用被终止
         */
        WeakReference ref = new WeakReference(new MyDate());
        System.gc();
    }
}
