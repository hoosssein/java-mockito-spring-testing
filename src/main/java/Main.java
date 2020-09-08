import testing.greet.Greeter;
import testing.writer.Console;

/**
 * Created by hossein on 2020-09-09
 */
public class Main {
    public static void main(String[] args) {
        new Greeter().greet(new Console());
    }
}
