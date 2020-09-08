package testing.greet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import testing.Main;
import testing.user.User;
import testing.user.UserRepository;
import testing.writer.Writeable;

import java.util.Scanner;

import static org.mockito.ArgumentMatchers.eq;

/**
 * Created by hossein on 2020-09-09
 */
@SpringBootTest(classes = Main.class)
@ExtendWith(MockitoExtension.class)
class GreeterTest {
    private final String ali = "Ali";
    private final int id = 2;

    @Mock
    Writeable writerMock;
    @Mock
    Scanner scannerMock;

    @Autowired
    @InjectMocks
    Greeter greeter;
    @Autowired
    UserRepository userRepository;

    @Test
    void greet() {
        userRepository.put(new User(id,ali));
        Mockito.when(scannerMock.nextLine()).thenReturn(ali);

        greeter.greet();

        Mockito.verify(writerMock).println(eq("Hello, " + ali + ". Your id is:" + id));
        Mockito.verify(scannerMock).nextLine();
        Mockito.verifyNoMoreInteractions(writerMock, scannerMock);
    }
}
