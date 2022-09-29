package Animals;

import java.security.PublicKey;

public abstract class Animal {
    private String nickname;

    private int age;

    //getters
    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public Animal(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    protected abstract void eat();

    protected abstract void sleep();

    protected abstract void go();

}
