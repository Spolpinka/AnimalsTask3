package Animals.Mammals;

public class Predator extends Mammal {
    private String mealType = "животная пища";

    public Predator(String nickname, int age, String environment, int speed) {
        super(nickname, age, environment, speed);
    }

    public Predator(String nickname, int age, String environment, int speed, String mealType) {
        super(nickname, age, environment, speed);
        if (mealType != null && !mealType.isBlank() && !mealType.isEmpty()) {
            this.mealType = mealType;
        }
    }

    @Override
    protected void eat() {
        haunt();
    }

    @Override
    public void walk() {
        System.out.println("Я сытый и гуляю!");
    }

    @Override
    public void sleep() {
        System.out.println("Я хищник - сплю, когда сыт!");
    }

    @Override
    public void go() {
        walk();
    }

    public void haunt() {
        System.out.println("Я - хищник, " + getNickname() + ", мой рацион - " + mealType);
    }

    @Override
    public String toString() {
        return "Хищник - " + super.toString() +
                ", тип пищи - " + mealType;
    }
}
