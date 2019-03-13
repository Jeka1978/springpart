package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("email")
public class EmailSender implements Sender {
    @Override
    public void send(Message message) {
        System.out.println("sent by EMAIL!!!!");
    }
}
