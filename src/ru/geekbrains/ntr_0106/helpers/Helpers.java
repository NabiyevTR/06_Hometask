package ru.geekbrains.ntr_0106.helpers;

import java.util.Random;

public class Helpers {
    public static float getValueInRange(float min, float max) {
        Random random = new Random();
        return min + random.nextFloat()*(max - min);
    }
}
