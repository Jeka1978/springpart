package real_spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Book
public class ShakespearQuoter implements Quoter {
    @Value("${shake}")
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
