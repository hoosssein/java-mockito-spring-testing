package testing.greet;

import testing.writer.Writeable;

import java.util.Scanner;

/**
 * Created by hossein on 2020-09-09
 */
public class Greeter {
    public void greet(Writeable out, Scanner s) {
        String name = s.nextLine();
        out.println("Hello, "+name);
    }
}
