package my_spring;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min = 3, max = 7)
    private int repeat;


    public void init() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVVVVVVVvvvvvvvvvvvvv");
        }
    }
}
