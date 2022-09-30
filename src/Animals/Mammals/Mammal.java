package Animals.Mammals;

import Animals.Animal;

public abstract class Mammal extends Animal {
    private String environment;
    private int speed;

    public String getEnvironment() {
        return environment;
    }

    public int getSpeed() {
        return speed;
    }

    public Mammal(String nickname, int age, String environment, int speed) {
        super(nickname, age);
        if (environment != null && !environment.isEmpty() && !environment.isBlank()) {
            this.environment = environment;
        }
        if (speed > 0) {
            this.speed = speed;
        }
    }

    @Override
    protected abstract void eat();

    protected abstract void walk();

    @Override
    protected abstract void sleep();

    @Override
    protected abstract void go();

    @Override
    public String toString() {
        return super.toString() +
                ", среда обитания - " + environment +
                ", максимальная скорость - " + speed;
    }
}
