/** 
		Classe que simula cálculos aritméticos entre dois 
		números inteiros.
		
		@author Victor Budal
		@since 09-09-19
*/


public class Calculadora{

	int n1,n2;
	
	int obterResto(int x, int y){
		
		int resto = x/y ;
		int soma = x - resto*y;
		return soma;
	}
	
	void gerarRestos(int[] vetX, int[] vetY,int tam){
	
		for(int i = 0 ; i<tam;i++){

			System.out.println(String.format("O resto da divisao de %d por %d  e %d",vetX[i],vetY[i],obterResto(vetX[i],vetY[i])));
		}
	}
	
	void multiplacaVetor(int[]vetX,int multi){
		int tam = vetX.length;
		
		for(int i =0 ; i<tam;i++){
		
			System.out.println("Multiplicacao "+vetX[i]*multi);
		}
	}
	
	
	
	public static void main(String[]args){
	
		Calculadora calc = new Calculadora();
		calc.n1= 10;
		calc.n2 = 3;
		
		//Calculadora[] Obter = new Calculadora[500];
		//Calculadora[] Obter2 = new Calculadora[500];
		int gerar1[] = new int[20];
		int gerar2[] = new int[20];
		
		int resto = calc.obterResto(calc.n1, calc.n2);
		
		System.out.println(String.format("O resto da divisao de %d por %d  e %d",calc.n1,calc.n2,resto));
		
		for(int i = 0; i<20 ; i++){
			if(i%2==0){
				
			gerar1[i]=i+3;
			gerar2[i]=i+1;
			
			}else{
				
				gerar1[i]=i+4;
				gerar2[i]=i+2;
			}
		}
	
		
		calc.gerarRestos(gerar1,gerar2,20);
		calc.multiplacaVetor(gerar1, 5);
	}
}