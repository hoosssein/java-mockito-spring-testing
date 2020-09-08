package testing.greet;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import testing.resolver.IdResolver;
import testing.user.User;
import testing.writer.Writeable;

import java.util.Scanner;

/**
 * Created by hossein on 2020-09-09
 */
@AllArgsConstructor
@Component
public class Greeter {
    Writeable out;
    Scanner s;
    IdResolver resolver;
    public void greet() {
        String name = s.nextLine();
        User user = resolver.resolve(name);
        out.println("Hello, "+name+". Your id is:"+ user.getId());
    }
}
