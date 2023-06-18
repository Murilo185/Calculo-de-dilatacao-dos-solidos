
import java.text.MessageFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Main {
	public static final Scanner scanner = new Scanner(System.in);	
	public static void DeltaL() {
		
		double comprimentoInicial, numeroBase, potencia10, alpha, diferencaTemperatura, deltaL, comprimentoFinal;
		
System.out.println("Dilatação Linear na qual você quer descobrir o delta L");
		
		System.out.println("Informe o comprimento inicial em metros");
		
		comprimentoInicial = scanner.nextDouble();
		scanner.nextLine();
			
		System.out.println("para informar o coeficiente de dilatação, informe primeiro o número base, e a potencia de 10");
		
		System.out.println("Informe o número base");
		
		numeroBase = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Agora informe a potencia de 10 na qual ele é multiplicado");
		
		potencia10 = scanner.nextInt();
		scanner.nextLine();
		
		alpha = numeroBase * Math.pow(10, potencia10);
		
		System.out.println("Agora informe a diferença de temperatura");
		
		diferencaTemperatura = scanner.nextDouble();
		scanner.nextLine();
		
		deltaL = comprimentoInicial * alpha * diferencaTemperatura;
		comprimentoFinal = comprimentoInicial + deltaL;
		
		String resultado = MessageFormat.format("Diferença de comprimento: {0}; \ncomprimento final: {1}", deltaL, comprimentoFinal);
		
		JOptionPane.showMessageDialog(null, resultado);
		
		scanner.close();
	}
	
	public static void CoeficienteDilatação() {
		System.out.println("Dilatação linear na qual você quer descobrir o coeficiente de dilatação");
		
		System.out.println("Insira o comprimento inícial");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criando as variaveis
		
		
		System.out.println("Bem vindo a calculadora de dilatação dos sólidos");
		
		System.out.println("O que você quer descobrir?\n"
				+ "[1] Dilatação Linear\n"
				+ "[2] Coeficiente de dilatação\n"
				+ "[3] Temperatura final");
		
		String resposta = scanner.nextLine();
		
		switch (resposta) {
		case "1":
			
			DeltaL();
			
		}
			
		
		
	}

}
