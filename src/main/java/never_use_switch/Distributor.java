package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class Distributor {
    @Autowired
    private Map<String, Sender> senderMap;


    public void sendMail(Message message) {
        String type = message.getDistributionType();
        Sender sender = senderMap.get(type);
        if (sender == null) {
            System.out.println(type + " not supported yet");
        } else {

            sender.send(message);
        }
    }
}








