package Animals.Mammals;

import Animals.Mammals.Mammal;

public class Herbivore extends Mammal {
    private final String mealType = "растительная пища";

    public String getMealType() {
        return mealType;
    }

    public Herbivore(String nickname, int age) {
        super(nickname, age, "поверхность земли", 50);
    }

    public Herbivore(String nickname, int age, String environment) {
        super(nickname, age, environment, 50);
    }

    public Herbivore(String nickname, int age, String environment, int speed) {
        super(nickname, age, environment, speed);
    }

    @Override
    protected void sleep() {
        System.out.println("Я травоядное - " + getNickname() + ", я сплю ночью!");
    }

    @Override
    protected void eat() {
        System.out.println("ем. Мой рацион - " + mealType);
    }

    @Override
    protected void go() {
        walk();
    }

    @Override
    protected void walk() {
        graze();
    }

    protected void graze() {
        System.out.println("Я, " + getNickname() + ", пасуcь и ");
        eat();
    }

}
