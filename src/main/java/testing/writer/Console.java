package testing.writer;

/**
 * Created by hossein on 2020-09-09
 */
public class Console implements Writeable {
    public void println(String s) {
        System.out.println(s);
    }
}
