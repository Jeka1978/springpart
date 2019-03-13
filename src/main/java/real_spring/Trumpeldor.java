package real_spring;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@History
public class Trumpeldor implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Good to die for our country");
    }
}
