package profiles_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class CadsService {
    @Autowired
    private CalcService calcService;

    @PostConstruct
    public void doX(){
        calcService.printAnswer();
    }
}
