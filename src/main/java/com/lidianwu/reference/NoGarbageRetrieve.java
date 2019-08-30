package com.lidianwu.reference;

import com.lidianwu.reference.utils.MyDate;

/**
 * 情况一：清除对象
 *
 * @author Created by ldianwu on 2019/8/30
 */
public class NoGarbageRetrieve {

    public static void main(String[] args) {
        /**
         * date虽然设为null，但由于JVM没有执行垃圾回收操作，MyDate的finalize()方法没有被运行。
         */
        MyDate date = new MyDate();
        date = null;
    }
}
