import javax.swing.JOptionPane;

public class Quest�o02 {

	public static void main(String[] args) {
		float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 n�mero!"));
		float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 n�mero!"));
		
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "O maior n�mero � o " +num1+ ".");
		} 
		else if (num1 == num2) {
			JOptionPane.showMessageDialog(null, "O n�mero " +num1+ " � igual ao n�mero " +num2+ ".");
		}
		else {
			JOptionPane.showMessageDialog(null, "O maior n�mero � o " +num2+ ".");
		}

	}

}
