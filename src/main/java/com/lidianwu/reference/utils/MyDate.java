package com.lidianwu.reference.utils;

import java.util.Date;

/**
 * MyDate
 *
 * @author Created by ldianwu on 2019/8/30
 */
public class MyDate extends Date {

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("object [Date: " + this.getTime() + "] is gc");
    }

    @Override
    public String toString() {
        return "Date: " + this.getTime();
    }

}
