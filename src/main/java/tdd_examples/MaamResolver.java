package tdd_examples;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MaamResolver {


    private double maam;

    @SneakyThrows
    public MaamResolver() {
        Thread.sleep(2000);
        maam = 0.18;
    }

    public double getMaam() {
        return maam;
    }
}
