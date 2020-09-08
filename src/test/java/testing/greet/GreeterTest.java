package testing.greet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import testing.writer.Writeable;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;

/**
 * Created by hossein on 2020-09-09
 */
class GreeterTest {
    private final String ali = "Ali";

    @Test
    void greet() {
        Writeable writerMock = Mockito.mock(Writeable.class);

        Scanner scannerMock = Mockito.mock(Scanner.class);
        Mockito.when(scannerMock.nextLine()).thenReturn(ali);

        Greeter greeter = new Greeter(writerMock, scannerMock);

        greeter.greet();

        Mockito.verify(writerMock).println(eq("Hello, "+ali));
        Mockito.verify(scannerMock).nextLine();
    }
}
