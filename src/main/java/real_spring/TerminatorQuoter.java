package real_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */

@Component
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] arr) {
        this.messages = asList(arr);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }
}
