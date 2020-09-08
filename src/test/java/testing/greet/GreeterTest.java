package testing.greet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import testing.resolver.IdResolver;
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
    private final int id = 2;

    @Mock
    Writeable writerMock;
    @Mock
    Scanner scannerMock;

    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    IdResolver idResolver;

    @InjectMocks
    Greeter greeter;

    @Test
    void greet() {
        Mockito.when(scannerMock.nextLine()).thenReturn(ali);
        Mockito.when(idResolver.resolve(eq(ali)).getId()).thenReturn(id);
        greeter.greet();

        Mockito.verify(writerMock).println(eq("Hello, "+ali+". Your id is:"+ id));
        Mockito.verify(scannerMock).nextLine();
        Mockito.verifyNoMoreInteractions(writerMock,scannerMock);
    }
}
