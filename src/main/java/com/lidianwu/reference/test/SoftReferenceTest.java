package com.lidianwu.reference.test;

import com.lidianwu.reference.utils.DrainMemoryUtil;
import com.lidianwu.reference.utils.MyDate;

import java.lang.ref.SoftReference;

/**
 * 软引用测试
 *
 * @author Created by ldianwu on 2019/8/30
 */
public class SoftReferenceTest {

    public static void main(String[] args) {
        /**
         * 在内存不足时，软引用被终止
         */
        SoftReference ref = new SoftReference(new MyDate());

        DrainMemoryUtil.drainMemory();
    }
}
