import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número!"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número!"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número!"));
		int result = 0;

		if (num1 > num2) {
			result = num1;
			num1 = num2;
			num2 = result;
		}
		if (num1 > num3) {
			result = num1;
			num1 = num3;
			num3 = result;
		}
		if (num2 > num3) {
			result = num2;
			num2 = num3;
			num3 = result;
		}
		
		JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: "+num1+ ", " +num2+ " e " +num3);
	}

}
