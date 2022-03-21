package calculadoraRestoDivisao;

import javax.swing.JOptionPane;

public class programaDivisaoResto {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Informe o número que você quer dividir");
		String b = JOptionPane.showInputDialog("Informe o número pelo o qual você quer dividir");
		
		double aNumero = Double.parseDouble(a);
		double bNumero = Double.parseDouble(b);
		
		int divisao = (int) (aNumero / bNumero) ;
		double resto = aNumero % bNumero;
		
		JOptionPane.showMessageDialog(null, " O valor da divisão é : " + divisao + " e o resto é : " + resto );
			
	}

}
