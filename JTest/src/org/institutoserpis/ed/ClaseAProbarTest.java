package org.institutoserpis.ed;
import static org.junit.jupiter.api.Assertions.*;
public class ClaseAProbarTest {
	
	public static void main(String [] args) {
		assertEquals(0,ClaseAProbar.VALOR_INICIAL);
		ClaseAProbar.main(null);
		assertEquals(100,ClaseAProbar.VALOR_INICIAL);
	}

}
