import Animals.Amphibian;
import Animals.Animal;
import Animals.Mammals.Herbivore;
import Animals.Mammals.Predator;
import Animals.Birds.Flying;
import Animals.Birds.NonFlying;

public class Main {
    public static void main(String[] args) {
        Animal gasel = new Herbivore("Газель", 5);
        Animal giraffe = new Herbivore("Жираф", 3, "саванна");
        Animal horse = new Herbivore("Лошадь Пржевальского", 7, "монгольские степи", 20);

        Animal hyena = new Predator("Гиена", 5, "саванна", 25, "падаль и свежая добыча");
        Animal tiger = new Predator("Тигр", 10, "лес", 25, "свежая добыча");
        Animal bear = new Predator("Медведь", 7, "лес", 30, "растительная и животная пища");

        Animal frog = new Amphibian("Лягушка");
        Animal snake = new Amphibian("Уж пресноводный", 1, "пресные водоемы", "лягушки, иная мелкая добыча");

        Animal peacock = new NonFlying("Павлин");
        Animal penguin = new NonFlying("Пингвин", 1, "побережье морей и океанов");
        Animal dodo = new NonFlying("Птица Додо", 3);

        Animal seagull = new Flying("Чайка");
        Animal albatross = new Flying("Альбатрос", 5);
        Animal falcon = new Flying("Фалькон", 3, "поля и леса");


        Animal[] animals = {
                gasel,
                giraffe,
                horse,
                hyena,
                tiger,
                bear,
                frog,
                snake,
                peacock,
                penguin,
                dodo,
                seagull,
                albatross,
                falcon
        };

        for (Animal a :
                animals) {
            System.out.println(a);
        }
    }
}