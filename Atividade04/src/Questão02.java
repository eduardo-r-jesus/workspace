import javax.swing.JOptionPane;

public class Questão02 {

	public static void main(String[] args) {
		float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 número!"));
		float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite 1 número!"));
		
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "O maior número é o " +num1+ ".");
		} 
		else if (num1 == num2) {
			JOptionPane.showMessageDialog(null, "O número " +num1+ " é igual ao número " +num2+ ".");
		}
		else {
			JOptionPane.showMessageDialog(null, "O maior número é o " +num2+ ".");
		}

	}

}
