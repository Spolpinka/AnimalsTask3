package Birds;

import Animals.Animal;

import java.security.GeneralSecurityException;

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
    protected abstract void eat();

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
