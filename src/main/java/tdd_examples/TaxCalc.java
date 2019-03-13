package tdd_examples;

/**
 * @author Evgeny Borisov
 */
public class TaxCalc {

    public double withMaam(double price) {
        double maam = Container.getInstance().getMaamResolver().getMaam();
        return price * maam+price;
    }


}
