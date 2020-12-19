package ru.geekbrains.ntr_0106.animals;

public abstract class Animal {

    protected float maxRunDistance;
    protected float maxSwimDistance;
    protected float maxJumpHeight;
    protected String name;


    public Animal(String name) {
        this.name = name;
    }

    public void run(float runDistance) {
        System.out.println(this.getClass().getSimpleName() + ": " + name);
        System.out.println(runDistance > 0 && runDistance <= maxRunDistance ? "run: true" : "run: false");
    }

    public void swim(float swimDistance) {
        System.out.println(this.getClass().getSimpleName() + ": " + name);
        System.out.println(swimDistance > 0 && swimDistance <= maxSwimDistance ? "swim: true" : "swim: false");
    }

    public void jump(float jumpHeight) {
        System.out.println(this.getClass().getSimpleName() + ": " + name);
        System.out.println(jumpHeight > 0 && jumpHeight <= maxJumpHeight ? "jump: true" : "jump: false");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(": ").append(name).append("\n");
        sb.append("Бег: ").append(String.format("%.1f", maxRunDistance)).append(" м.\n");
        sb.append("Прыжки: ").append(String.format("%.1f", maxJumpHeight)).append(" м.\n");
        sb.append("Плавание: ").append(String.format("%.1f", maxSwimDistance)).append(" м.\n");
        return sb.toString();
    }

    public void print() {
        System.out.println(this);
    }
}
