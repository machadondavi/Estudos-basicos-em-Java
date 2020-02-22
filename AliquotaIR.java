import javax.swing.JOptionPane;

public class AliquotaIR {
	public static void main(String[]args) {
		
		int salario;
		
		salario = Integer.parseInt(JOptionPane.showInputDialog("Qual é o seu salario?"));
		System.out.println("Seu salario é: " + salario);
		
		
				
		if (salario >= 1900.0 && salario <= 2800.0) {
			JOptionPane.showMessageDialog(null, "Sua aliquota é de 7,5% e sua dedução será no valor de R$150,00");
		 
		}
		
		if (salario >= 2800.01 && salario <= 3751.0) {
			JOptionPane.showMessageDialog(null, "Sua aliquota é de 15% e sua dedução será no valor de R$350,00"); 
			//System.out.println( "Sua aliquota é de 15%");
			//System.out.println("E sua dedução é no valor de R$350");
		}
		if (salario >= 3751.01 && salario <= 4664.0) {
			JOptionPane.showMessageDialog(null, "Sua aliquota é de 22,5% e sua dedução será no valor de R$636,00");
			//System.out.println("Sua aliquota é de 22,5%");
			//System.out.println("E sua dedução é no valor de R$636");
		}
		
    }
}
	
