package com.STS.machine.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomPassword {


    /**
     * 随机生成字符 或 者数字
     *
     * @return
     */
    private static String getRandom() {
        String value = "";
        Random random = new Random();
        int gen = random.nextInt(10);
        value += gen;
        return value;
    }


    public static String getRandomString(int length) {
        String value = "";
        for (int i =0; i<length; i++) {
            value += getRandom();
        }
        return value;
    }


}