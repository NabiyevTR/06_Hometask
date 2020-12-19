package ru.geekbrains.ntr_0106.animals;

import ru.geekbrains.ntr_0106.helpers.Helpers;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        maxRunDistance = Helpers.getValueInRange(400, 600);
        maxJumpHeight = Helpers.getValueInRange(0.4f, 0.6f);
        maxSwimDistance = Helpers.getValueInRange(8, 12);
    }
}
