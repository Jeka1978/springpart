package animals;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.*;

/**
 * @author Evgeny Borisov
 */
public class AnimalFactory {
    private Random random = new Random();

    private Reflections reflections = new Reflections("animals");
    private List<Class<? extends Animal>> animalTypes = new ArrayList<>();

    public AnimalFactory() {
        Set<Class<? extends Animal>> classes = reflections.getSubTypesOf(Animal.class);
        for (Class<? extends Animal> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                animalTypes.add(aClass);
            }
        }
    }

    @SneakyThrows
    public Animal createRandomAnimal() {
        int i = random.nextInt(animalTypes.size());
        return animalTypes.get(i).newInstance();
    }
}





