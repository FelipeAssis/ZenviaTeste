import javax.swing.JOptionPane;

public class  CashMachineService {

	public int receiveValue() {

		int value = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para saque: "));

		return value;
	}

	public int validateValue(int value) {

		while (value % 2 == 1) {

			value = Integer.parseInt(
					JOptionPane.showInputDialog("O caixa contém apenas as seguintes cédulas: R$100, R$50, R$20, R$10."
							+ "\nPor favor digite um valor válido para saque:"));
		}

		return value;
	}

	public void bankNotesCalculate(int value) {

		int n100, n50, n20, n10;
		int r100, r50, r20;

		n100 = value / 100;
		r100 = value % 100;

		n50 = r100 / 50;
		r50 = r100 % 50;

		n20 = r50 / 20;
		r20 = r50 % 20;

		n10 = r20 / 10;

		bankNoteCount(n100, n50, n20, n10);

	}

	public void bankNoteCount(int n100, int n50, int n20, int n10) {
		JOptionPane.showMessageDialog(null, "\nNotas de R$ 100: " + n100 + "\nNotas de R$ 50: " + n50
				+ "\nNotas de R$ 20: " + n20 + "\nNotas de R$ 10: " + n10);

		int optionType = JOptionPane.OK_CANCEL_OPTION;
		int result = JOptionPane.showConfirmDialog(null, "Deseja sacar mais?", "Message", optionType);
		if (result == JOptionPane.OK_OPTION) {
			new Application();
			Application.main(null);
		}
		
		
		

	}

}
