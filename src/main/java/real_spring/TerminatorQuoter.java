package real_spring;

import my_spring.InjectRandomInt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */

@Component
public class TerminatorQuoter implements Quoter {
    @InjectRandomInt(min = 3, max = 5)
    private int repeat;

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] arr) {
        this.messages = asList(arr);
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            messages.forEach(System.out::println);
        }
    }
}




