package co.za.nakampe.wwwdot;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SetswanaGreetingTest{

@Test
public void shouldReturnMessage(){

Greeting greeting = new SetswanaGreeting("Dumela");

assertEquals("Dumela",greeting.getMessage());

}

}

