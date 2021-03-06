import java.util.Scanner;

public class Main {
	
	/*Crie uma classe TestaArrays(Main) e no método main crie um array de contas de tamanho 10.
	 *  Em seguida, faça um laço para criar 10 contas com saldos distintos e colocá-las no array. 
	 *  Por exemplo, você pode utilizar o índice do laço e multiplicá-lo por 100 
	 *  para gerar o saldo de cada conta:
	 *  
	 *  Ainda na classe TestaArrays(Main), faça um outro laço para calcular 
	 *  e imprimir a média dos saldos de todas as contas do array.
	 *  
	 */
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		float media = 0;
		
		for(int i=0;i<contas.length;i++) {
			Conta contaTemp = new Conta(0, "Usuário",i);
			contaTemp.deposito(i * 100);
			contas[i] = contaTemp;
			
			System.out.println("Saldo da Conta " + i + " "+ contas[i].getSaldo());
		}
		
		for(int i=0;i<contas.length;i++) {
			media += contas[i].getSaldo();	
		}
		
		System.out.println("Média: " + media / contas.length);			
	
	}

}
