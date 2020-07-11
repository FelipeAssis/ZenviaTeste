

public class Application {

	public static void main(String[] args) {
		int amount;
		
		CashMachineService cms = new CashMachineService();

		amount = cms.receiveValue();			
		amount = cms.validateValue(amount);
		cms.bankNotesCalculate(amount);
		
		

		
	

	}
}
