package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("whatsapp")
public class WhatsappSender implements Sender {
    @Override
    public void send(Message message) {
        System.out.println("sent by Whatsapp");
    }
}
