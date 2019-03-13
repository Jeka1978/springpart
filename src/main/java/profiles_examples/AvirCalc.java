package profiles_examples;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@Profile("AVIR")
public class AvirCalc implements CalcService {
    @Override
    public void printAnswer() {
        System.out.println("2+2=4");
    }
}
