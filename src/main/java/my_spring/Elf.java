package my_spring;

import lombok.ToString;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@ToString
public class Elf {
    @InjectRandomInt(min = 10, max = 20)
    private int power;  // >10  <20
    @InjectRandomInt(min = 300, max = 400)
    private int speed;


}
