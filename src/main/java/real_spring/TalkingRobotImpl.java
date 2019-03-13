package real_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
public class TalkingRobotImpl implements TalkingRobot {
    @Film
    private List<Quoter> quoters;
    @Override

    @PostConstruct
    public void talk() {
        quoters.forEach(quoter -> quoter.sayQuote());
    }
}



