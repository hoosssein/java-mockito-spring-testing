package testing.writer;

import org.springframework.stereotype.Service;

/**
 * Created by hossein on 2020-09-09
 */
@Service
public class Console implements Writeable {
    public void println(String s) {
        System.out.println(s);
    }
}
