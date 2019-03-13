package tdd_examples;

/**
 * @author Evgeny Borisov
 */
public class Container {
    private static Container ourInstance = new Container();

    public static Container getInstance() {
        return ourInstance;
    }

    private Container() {
    }

    private MaamResolver maamResolver = new MaamResolver();



    public MaamResolver getMaamResolver(){
        return maamResolver;
    }
}
