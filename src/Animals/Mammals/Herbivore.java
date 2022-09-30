package Animals.Mammals;

import Animals.Mammals.Mammal;

public class Herbivore extends Mammal {
    private String mealType = "растительная пища";

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

    public Herbivore(String nickname, int age, String environment, int speed, String mealType) {
        super(nickname, age, environment, speed);
        if (mealType != null && !mealType.isBlank() && !mealType.isEmpty()) {
            this.mealType = mealType;
        }
    }

    @Override
    protected void sleep() {
        System.out.println("Я травоядное - " + getNickname() + ", я сплю ночью!");
    }

    @Override
    public void eat() {
        System.out.println("ем. Мой рацион - " + mealType);
    }

    @Override
    public void go() {
        walk();
    }

    @Override
    public void walk() {
        graze();
    }//ну не гуляют травоядные, это только у человека высшая нервная деятельность позволяет отвлеченно прогуливаться, без цели

    public void graze() {
        System.out.println("Я, " + getNickname() + ", пасуcь и ");
        eat();
    }

    @Override
    public String toString() {
        return "Травоядное животное - " + super.toString() +
                ", тип пищи " + mealType;
    }
}
