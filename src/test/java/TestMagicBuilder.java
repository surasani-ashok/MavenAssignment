import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMagicBuilder {
	
	 @Test
	    public void testLucky() {
	        assertEquals(7, MagicBuilder.getLucky());
	    }

}
