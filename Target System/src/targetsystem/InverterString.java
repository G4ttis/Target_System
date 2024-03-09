package targetsystem;

import javax.swing.JOptionPane;

public class InverterString {

	public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Digite uma frase:");

        if (input != null && !input.isEmpty()) {

            String stringInvertida = inverterString(input);


            JOptionPane.showMessageDialog(null, "String Invertida: " + stringInvertida);
            
        } else {
        	
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, forneça uma string.");
            
        }
    }

    private static String inverterString(String input) {
    	
        char[] caracteres = input.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
        	
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
            
        }

        return new String(caracteres);
        
    }
	
}
