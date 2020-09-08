package testing.greet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import testing.writer.Writeable;

import java.util.Scanner;

import static org.mockito.ArgumentMatchers.eq;

/**
 * Created by hossein on 2020-09-09
 */
@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
//@RunWith(MockitoJUnitRunner)
class GreeterTest {
    private final String ali = "Ali";

    @Mock
    Writeable writerMock;
    @Mock
    Scanner scannerMock;
    @InjectMocks
    Greeter greeter;

    @Test
    void greet() {
        Mockito.when(scannerMock.nextLine()).thenReturn(ali);

        greeter.greet();

        Mockito.verify(writerMock).println(eq("Hello, "+ali));
        Mockito.verify(scannerMock).nextLine();
        Mockito.verifyNoMoreInteractions(writerMock,scannerMock);
    }
}
