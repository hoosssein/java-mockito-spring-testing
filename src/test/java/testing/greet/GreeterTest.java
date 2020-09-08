package testing.greet;

import org.junit.jupiter.api.Test;
import testing.writer.Writeable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by hossein on 2020-09-09
 */
class GreeterTest {
    @Test
    void greet() {
        Greeter greeter = new Greeter();
        WriterStub writerStub = new WriterStub();
        Scanner scannerStub = new Scanner("Ali");

        greeter.greet(writerStub,scannerStub);

        assertEquals(1, writerStub.printed.size());
        assertEquals("Hello, Ali", writerStub.printed.get(0));
    }
}

class WriterStub implements Writeable {
    List<String> printed = new ArrayList<>();

    @Override
    public void println(String s) {
        printed.add(s);
    }
}