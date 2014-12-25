package com.togo.core.utils;

import java.util.Date;

public class DateUtils {

    public static void main(String[] args) {
        System.out.println("Hello from ant: "+getLocalCurrentDate());
    }

    private static Date getLocalCurrentDate() {
        return new Date();
    }
}