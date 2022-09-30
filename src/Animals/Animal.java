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

    public Animal(String nickname) {
        if (nickname != null && !nickname.isBlank() && !nickname.isEmpty()) {
            this.nickname = nickname;
        }
        this.age = 0;
    }

    public Animal(String nickname, int age) {
        if (nickname != null && !nickname.isBlank() && !nickname.isEmpty()) {
            this.nickname = nickname;
        }
        if (age > 0) {
            this.age = age;
        }
    }

    protected abstract void eat();

    protected abstract void sleep();//переопределен не везде?

    protected abstract void go();

    @Override
    public String toString() {
        return nickname + ", возраст - " + age;
    }
}
