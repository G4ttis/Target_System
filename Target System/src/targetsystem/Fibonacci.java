package targetsystem;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		
		 String input = JOptionPane.showInputDialog("Informe um número inteiro:");
		
		 try {
			 
			 int numero = Integer.parseInt(input);
			 
			 if (pertenceFibonacci(numero)){
				 
				 JOptionPane.showMessageDialog(null, numero + " pertence a sequência de Fibonacci.");
			
			 } else {
	                JOptionPane.showMessageDialog(null, numero + " não pertence a sequência de Fibonacci.");
	           }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
	        }
	}
	
	public static boolean pertenceFibonacci(int num) {
		
		int a = 0;
		int b = 1;
		int temp;
		
		while (a <= num) {
            if (a == num) {
                return true;
            }

            temp = a;
            a = b;
            b = temp + b;
        }
		
		return false;
		
	}

}
