/** 
		Jogo de adivinhação
		
		
		@author Victor Budal
		@since 09-09-19
*/



import java.util.Scanner;
import java.text.DecimalFormat;

public class jogoDeAdivinhacao {
	
	public static void main (String[]args){
		DecimalFormat formato = new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in);
		int coringa1= 15,coringa2= 37;
		int participantes,numbMax;
		int a, b,menorNumb=10000;
		double porcentagem=0;
		System.out.println("Forneca o numero de participantes: ");
		
		participantes= scan.nextInt();
		System.out.println("Forneca o numero maximo de tentativas: ");
		numbMax=scan.nextInt();
		
		int acertos= 0, jogador = 1, ganhador = 0;
		
		
		do{
			System.out.println("Jogador "+jogador);
			
			for(int i = 1; i <=numbMax; i++){
				
				System.out.println("Forneca dois valores inteiros entre 0 e 100: ");
				a= scan.nextInt();
				b= scan.nextInt();
				while (true){
					if(a>100 || b >100){
						System.out.println("---");
						System.out.println("Erro: Porfavor forneca dois valores inteiros entre 0 e 100: ");
						a= scan.nextInt();
						b= scan.nextInt();
						System.out.println("---");
					}else break;
				}
				
				if(a==coringa1 && b == coringa2 || a==coringa2 && b== coringa1){
					if(i<menorNumb){
						menorNumb = i;
						ganhador = jogador;
						
					}
					++acertos;
					break;
					
				}
				
			}

			jogador++;
			
		}while(jogador<=participantes);
		
		if(ganhador>0){
	
			System.out.println(String.format("Vencedor: Jogador %d (numero de tentativas: %d)",ganhador, menorNumb));
		}else{
			System.out.println("Sem vencedores");
			
		}

		porcentagem= ((100.0*(participantes-acertos))/participantes)/100;
		
		System.out.println("Percentual de jogadores que nao acertaram em nenhuma das tentativas: "+formato.format(porcentagem));

	
		
	}
	
}