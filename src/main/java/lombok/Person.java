package lombok;

import lombok.experimental.Wither;

import java.util.Map;
import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
@Value
@AllArgsConstructor
@Builder
@Wither
public class Person {
    private String name;
    private int age;
    private int salary;
    @NonNull
    @Singular
    private Map<String,Integer> beers;
    @Singular("דג")
    private Map<String,Integer> fish;
}










