package Animals;

public class Amphibian extends Animal {
    private String environment = "берега водных объектов";
    private String mealType = "мелкая водная добыча, насекомые";

    public Amphibian(String nickname) {
        super(nickname, 0);
    }

    public Amphibian(String nickname, int age) {
        super(nickname, age);
    }

    public Amphibian(String nickname, int age, String environment) {
        super(nickname, age);
        if (environment != null && !environment.isEmpty() && !environment.isBlank()) {
            this.environment = environment;
        }
    }

    public Amphibian(String nickname, int age, String environment, String mealType) {
        super(nickname, age);
        if (environment != null && !environment.isEmpty() && !environment.isBlank()) {
            this.environment = environment;
        }
        if (mealType != null && !mealType.isBlank() && !mealType.isEmpty()) {
            this.mealType = mealType;
        }
    }

    @Override
    protected void eat() {
        System.out.println("Пойду, поем мошек и мелких рыбешек! Я же земноводное - " + getNickname());
    }

    @Override
    protected void sleep() {
        System.out.println("Сплю в своей среде обитания - " + environment + "!");
    }

    @Override
    protected void go() {
        System.out.println("Я - земноводное " + getNickname() + ", движусь в поисках пищи!");
    }

    public void walk() {
        go();
    }

    @Override
    public String toString() {
        return "Амфибия - " + super.toString() +
                ", среда обитания - " + environment +
                ", тип пищи - " + mealType +
                " а еще я двоякодышащее, если кто еще может вспомнить курс биологии";
    }
}
