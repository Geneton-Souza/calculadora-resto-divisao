package calculadoraRestoDivisao;

import javax.swing.JOptionPane;

public class programaDivisaoResto {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Informe o n�mero que voc� quer dividir");
		String b = JOptionPane.showInputDialog("Informe o n�mero pelo o qual voc� quer dividir");
		
		double aNumero = Double.parseDouble(a);
		double bNumero = Double.parseDouble(b);
		
		int divisao = (int) (aNumero / bNumero) ;
		double resto = aNumero % bNumero;
		
		JOptionPane.showMessageDialog(null, " O valor da divis�o � : " + divisao + " e o resto � : " + resto );
			
	}

}
