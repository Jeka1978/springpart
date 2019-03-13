package profiles_examples;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@Profile("SEE")
//spring.profiles.active = SEE
public class SeeCalc implements CalcService {
    @Override
    public void printAnswer() {
        System.out.println("2-2=0");
    }
}
