import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CashMachineTest {
	CashMachineService cms = new CashMachineService();
	


	@Test
	void testValidateValue() {
		
		assertEquals("CASO 1", 80, cms.validateValue(80));		
		assertEquals("CASO 2", 20, cms.validateValue(20));
		assertEquals("CASO 3", 50, cms.validateValue(50));
		assertEquals("CASO 4", 100, cms.validateValue(100));		
		
	}

	
}
