package lombok;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

/**
 * @author Evgeny Borisov
 */
@Slf4j
public class Main {


    public static void main(String[] args) {

        log.info("Stam");

        Person person = Person.builder().age(44).beer("Leff",2).beer("tuborg",1)
                .דג("Ira",18)
                .name("Anatoliy").salary(150).build();
        System.out.println("person = " + person);

    }
}
