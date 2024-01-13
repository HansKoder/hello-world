import org.example.HelloWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    private HelloWorld helloWorld = new HelloWorld();

    @Test
    public void shouldSayHelloWorld () {
        assertEquals("hello world", helloWorld.say());
    }

}
