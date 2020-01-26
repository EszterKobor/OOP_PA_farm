package com.codecool.farm;

import java.util.Random;

public class MyUtil {
    private static final Random RANDOM = new Random();

    public static boolean eventWithChance(int chance) {
        return RANDOM.nextInt(100) < chance;
    }

}
