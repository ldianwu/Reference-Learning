package com.lidianwu.reference.utils;

/**
 * 强引用测试
 *
 * @author Created by ldianwu on 2019/8/30
 */
public class DrainMemoryUtil {

    /**
     * 消耗大量内存
     */
    public static void drainMemory() {
        String[] array = new String[1024 * 1024 * 10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 'a'; j <= 'z'; j++) {
                array[i] += (char) j;
            }
        }

    }
}
