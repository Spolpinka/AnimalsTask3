package Animals.Birds;

import Animals.Animal;

public abstract class Bird extends Animal {
    private String environment = "земля - воздух";

    public Bird(String nickname) {
        super(nickname);
    }

    public Bird(String nickname, int age) {
        super(nickname, age);
    }

    public Bird(String nickname, int age, String environment) {
        super(nickname, age);
        if (environment != null && !environment.isEmpty() && !environment.isBlank()) {
            this.environment = environment;
        }
    }

    @Override
    protected abstract void eat();//хотелось еще сделать логику на птенца, но не стал

    @Override
    protected abstract void sleep();

    @Override
    protected abstract void go();

    protected abstract void hunt();

    @Override
    public String toString() {
        return super.toString() + ", среда обитания " + environment;
    }
}
