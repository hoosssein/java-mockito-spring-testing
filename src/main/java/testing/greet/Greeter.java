package testing.greet;

import lombok.AllArgsConstructor;
import testing.writer.Writeable;

import java.util.Scanner;

/**
 * Created by hossein on 2020-09-09
 */
@AllArgsConstructor
public class Greeter {
    Writeable out;
    Scanner s;
    public void greet() {
        String name = s.nextLine();
        out.println("Hello, "+name);
    }
}
