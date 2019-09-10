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
		int resto ;
		int soma;
		for(int i = 0 ; i<tam;i++){
			
			resto = 0;
			soma = 0 ;
			soma = vetX[i] / vetY[i];
			resto = vetX[i]-vetY[i]*soma;
			
			System.out.println(String.format("O resto da divisao de %d por %d  e %d",vetX[i],vetY[i],resto));

		}
		
					return resto ;
		
	}
	
	 
	
	public static void main(String[]args){
	
		Calculadora calc = new Calculadora();
		calc.n1= 10;
		calc.n2 = 3;
		
		Calculadora[] Obter = new Calculadora[500];
		Calculadora[] Obter2 = new Calculadora[500];
		Obter[0].n1(10);
		Obter2[0].n1(3);
		
		
		calc.gerarRestos(Obter,Obter2,1);
		
		//for(int i = 0)
		
		
		
		int resto = calc.obterResto(calc.n1, calc.n2);
		
	
		System.out.println(String.format("O resto da divisao de %d por %d  e %d",calc.n1,calc.n2,resto));
		
	}
}