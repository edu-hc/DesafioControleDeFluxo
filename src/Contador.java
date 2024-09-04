import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = Integer.parseInt(terminal.nextLine());
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = Integer.parseInt(terminal.nextLine());
		
		try {

			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {

			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		
		int contagem = parametroDois - parametroUm;
		
		if(parametroUm > parametroDois) {
			
			throw new ParametrosInvalidosException();
		}
		
		for(int i = 0; i < contagem; i++) {
			
			System.out.println("Contando... " + (i+1));
		}

	}
}