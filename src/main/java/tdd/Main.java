package tdd;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();

        testRunner.runAllTests("tdd.MyTest");
    }
}
