package hello;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GreetingTests {

   @Test
    public void testGreetingConstructor(){
       Greeting greeting = new Greeting(1l, "greetings");
       assertEquals(1l, greeting.getId());
       assertEquals("hest", greeting.getContent());
   }
}
