import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMessageBuilder {
	
	@Test
    public void testHelloWorld() {
        assertEquals("hello world", MessageBuilder.getHelloWorld());
    }

    @Test
    public void testNumber10() {
        assertEquals(10, MessageBuilder.getNumber10());
    }

}
