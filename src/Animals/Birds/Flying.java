package Animals.Birds;

public class Flying extends Bird{
    private String movementType = "могу летать!";

    public String getMovementType() {
        return movementType;
    }

    public Flying(String nickname) {
        super(nickname);
    }

    public Flying(String nickname, int age) {
        super(nickname, age);
    }

    public Flying(String nickname, int age, String environment) {
        super(nickname, age, environment);
    }

    @Override
    public void eat() {
        hunt();
    }

    @Override
    public void sleep() {
        System.out.println("Сплю высоко на дереве, потому что я - " + getNickname() + " и " + movementType);
    }

    @Override
    public void go() {
        hunt();
    }

    @Override
    public void hunt() {
        System.out.println("Охочусь с воздуха, потому что я - " + getNickname() + " и " + movementType);
    }

    public void fly() {
        System.out.println("Лечу, потому что я - " + getNickname() + " и " + movementType);
    }

    @Override
    public String toString() {
        return "Летающая птица - " + super.toString() +
                ", тип передвижения - " + movementType;
    }
}
