package real_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);

        TerminatorQuoter terminatorQuoter = context.getBean(TerminatorQuoter.class);
        terminatorQuoter.sayQuote();
    }
}
