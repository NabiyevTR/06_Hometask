package ru.geekbrains.ntr_0106;

import ru.geekbrains.ntr_0106.animals.Cat;
import ru.geekbrains.ntr_0106.animals.Dog;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Белка");
        Dog dog2 = new Dog("Стрелка");

        cat1.print();
        cat2.print();
        dog1.print();
        dog2.print();

        cat1.jump(100);
        cat1.jump(1);
        cat1.swim(2);
        cat1.run(100);

        cat2.jump(100);
        cat2.jump(1);
        cat2.swim(2);
        cat2.run(100);

        dog1.jump(100);
        dog1.jump(1);
        dog1.swim(2);
        dog1.run(100);

        dog2.jump(100);
        dog2.jump(1);
        dog2.swim(2);
        dog2.run(100);

    }
}
