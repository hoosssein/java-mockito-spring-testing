package testing.greet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.writer.Writeable;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by hossein on 2020-09-09
 */
class GreeterTest {
    private final String ali = "Ali";

    @Test
    void greet() {
        WriterMock writerMock = new WriterMock();
        Scanner scannerStub = new Scanner(ali);
        Greeter greeter = new Greeter(writerMock, scannerStub);

        greeter.greet();

        assertTrue(writerMock.success);
    }


    class WriterMock implements Writeable {
        boolean success = false;

        @Override
        public void println(String s) {
            if (("Hello, " + ali).equals(s)) {
                success = true;
            }
        }
    }
}
