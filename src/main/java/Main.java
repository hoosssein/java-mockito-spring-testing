import testing.greet.Greeter;
import testing.writer.Console;

import java.util.Scanner;

/**
 * Created by hossein on 2020-09-09
 */
public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        new Greeter().greet(new Console(), sin);
    }
}
