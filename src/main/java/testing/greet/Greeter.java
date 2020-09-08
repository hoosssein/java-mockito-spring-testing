package testing.greet;

import testing.writer.Writeable;

/**
 * Created by hossein on 2020-09-09
 */
public class Greeter {
    public void greet(Writeable out) {
        out.println("Hello World");
    }
}
