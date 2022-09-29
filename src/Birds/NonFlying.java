package Birds;

import org.w3c.dom.ls.LSOutput;

public class NonFlying extends Bird{
    private String movementType = "не летаю!";

    public String getMovementType() {
        return movementType;
    }

    public NonFlying(String nickname) {
        super(nickname);
    }

    public NonFlying(String nickname, int age) {
        super(nickname, age);
    }

    public NonFlying(String nickname, int age, String environment) {
        super(nickname, age, environment);
    }

    @Override
    public void eat() {
        System.out.println("Поем что-нибудь с земли, ведь я - нелетающая птица " + getNickname());
    }

    @Override
    public void sleep() {
        System.out.println("Буду спать на земле, ведь я - нелетающая птица " + getNickname());
    }

    @Override
    public void go() {
        walk();
    }

    public void walk() {
        hunt();
    }

    @Override
    public void hunt() {
        System.out.println("Хожу в поисках пищи, потому что я " + movementType);
    }

    @Override
    public String toString() {
        return "Не летающая птица - " + super.toString() +
                ", тип передвижения - " + movementType;
    }
}
