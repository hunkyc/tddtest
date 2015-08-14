import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void Test_Get_Message() throws Exception {
        HelloWorld h = new HelloWorld("martin");
        assertTrue(h.getMessage().equals("Hello martin"));
    }
}