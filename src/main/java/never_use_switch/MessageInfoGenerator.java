package never_use_switch;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Service
public class MessageInfoGenerator {
    @Autowired
    private DataFactory dataFactory;

    private List<String> types = asList("sms", "whatsapp","email");
    private Random random = new Random();

    @Autowired
    private Distributor mailDistributor;

    @Scheduled(fixedDelay = 1000)
    public void generateMessage() {
        String msgType = types.get(random.nextInt(types.size()));
        Message message = Message.builder()
                .content(dataFactory.getRandomText(100)).distributionType(msgType).build();
        mailDistributor.sendMail(message);
    }
}












