package com.lidianwu.reference;

import com.lidianwu.reference.utils.DrainMemoryUtil;
import com.lidianwu.reference.utils.MyDate;

/**
 * 情况三：隐式调用垃圾回收
 *
 * @author Created by ldianwu on 2019/8/30
 */
public class ImplicitGarbageRetrieve {

    public static void main(String[] args) {
        /**
         * 虽然没有显式调用垃圾回收方法System.gc()，但是由于运行了耗费大量内存的方法，触发JVM进行垃圾回收。
         */
        MyDate date = new MyDate();
        date = null;

        DrainMemoryUtil.drainMemory();
    }
}
