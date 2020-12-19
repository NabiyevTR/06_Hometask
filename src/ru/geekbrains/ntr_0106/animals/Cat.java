package ru.geekbrains.ntr_0106.animals;

import ru.geekbrains.ntr_0106.helpers.Helpers;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        maxRunDistance = Helpers.getValueInRange(150, 220);
        maxJumpHeight = Helpers.getValueInRange(1.8f, 2.2f);
        maxSwimDistance = 0;
    }
}
