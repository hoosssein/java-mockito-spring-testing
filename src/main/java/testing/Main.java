package testing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

/**
 * Created by hossein on 2020-09-09
 */

@Configuration
@ComponentScan("testing")
public class Main {
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
