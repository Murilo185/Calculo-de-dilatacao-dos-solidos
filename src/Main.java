
import java.text.MessageFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Main {
	public static final Scanner scanner = new Scanner(System.in);	
	public static void DeltaL() {
		
		double comprimentoInicial, numeroBase, potencia10, alpha, diferencaTemperatura, deltaL, comprimentoFinal;
		
System.out.println("Dilata��o Linear na qual voc� quer descobrir o delta L");
		
		System.out.println("Informe o comprimento inicial em metros");
		
		comprimentoInicial = scanner.nextDouble();
		scanner.nextLine();
			
		System.out.println("para informar o coeficiente de dilata��o, informe primeiro o n�mero base, e a potencia de 10");
		
		System.out.println("Informe o n�mero base");
		
		numeroBase = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Agora informe a potencia de 10 na qual ele � multiplicado");
		
		potencia10 = scanner.nextInt();
		scanner.nextLine();
		
		alpha = numeroBase * Math.pow(10, potencia10);
		
		System.out.println("Agora informe a diferen�a de temperatura");
		
		diferencaTemperatura = scanner.nextDouble();
		scanner.nextLine();
		
		deltaL = comprimentoInicial * alpha * diferencaTemperatura;
		comprimentoFinal = comprimentoInicial + deltaL;
		
		String resultado = MessageFormat.format("Diferen�a de comprimento: {0}; \ncomprimento final: {1}", deltaL, comprimentoFinal);
		
		JOptionPane.showMessageDialog(null, resultado);
		
		scanner.close();
	}
	
	public static void CoeficienteDilata��o() {
		System.out.println("Dilata��o linear na qual voc� quer descobrir o coeficiente de dilata��o");
		
		System.out.println("Insira o comprimento in�cial");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criando as variaveis
		
		
		System.out.println("Bem vindo a calculadora de dilata��o dos s�lidos");
		
		System.out.println("O que voc� quer descobrir?\n"
				+ "[1] Dilata��o Linear\n"
				+ "[2] Coeficiente de dilata��o\n"
				+ "[3] Temperatura final");
		
		String resposta = scanner.nextLine();
		
		switch (resposta) {
		case "1":
			
			DeltaL();
			
		}
			
		
		
	}

}
