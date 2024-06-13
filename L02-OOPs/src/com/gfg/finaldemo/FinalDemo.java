package com.gfg.finaldemo;

import com.gfg.interfacedemo.TataCar;
import com.gfg.interfacedemo.TataPunch;
import com.gfg.interfacedemo.TataTiago;

import java.util.Date;

public class FinalDemo {

    private static String lecture = "02";  // Value can be updated (since not final)

    private static final double pi = 3.14;  // Value cannot be updated (since marked final)

    private static final TataCar tataCar = new TataTiago();  // Object reference cannot be updated (since marked final)

    private static final Date date = new Date(); // Reference cannot be modified, but the value within the object can be changed

    public static void main(String[] args) {
        lecture = "03";  // Valid
        // pi = 22/7; // Invalid

        // tataCar = new TataPunch();  // Invalid

        System.out.println(date);
        // date = new Date(432562457); // Invalid
        date.setTime(432562457);
        System.out.println(date);
    }


}

