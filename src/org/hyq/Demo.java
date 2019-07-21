package org.hyq;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    int a;
    int b;


    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        date(sdf);
    }

    private static void date(SimpleDateFormat sdf) {
        System.out.println(new Date(java.sql.Date.valueOf(sdf.format(new Date())).getTime()));
    }
}