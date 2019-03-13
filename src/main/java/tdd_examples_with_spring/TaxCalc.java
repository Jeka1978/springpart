package tdd_examples_with_spring;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tdd_examples.Container;

/**
 * @author Evgeny Borisov
 */

@Service
public class TaxCalc {
    @Autowired
    @Setter
    private SpringMaamResolver maamResolver;


    public double withMaam(double price) {
        if (price < 0) {
            throw new IllegalStateException("can't be negative");
        }
        double maam = maamResolver.getMaam();
        return price * maam+price;
    }
}
