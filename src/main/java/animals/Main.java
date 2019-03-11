package animals;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();
        for (int i = 0; i < 20; i++) {
            Animal animal = factory.createRandomAnimal();
            animal.makeVoice();
        }
    }
}
