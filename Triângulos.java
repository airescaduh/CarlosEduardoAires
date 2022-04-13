import java.util.Scanner;

public class Triângulos {
	public static void main(String[] args) {
try {
		Scanner dados = new Scanner(System.in);
		System.out.println("Calculando a Área de Triângulos Utilizando a Fórmula de Heron. \n");
		System.out.println("Triângulo X");
		System.out.print("Digite o Lado A do Triângulo x: ");
		double ladoA = dados.nextDouble();

		System.out.print("Digite o Lado B do Triângulo x: ");
		double ladoB = dados.nextDouble();

		System.out.print("Digite o Lado C do Triângulo x: ");
		double ladoC = dados.nextDouble();

		double soma_Dos_Lados_Do_Triangulo_X = ladoA + ladoB + ladoC;
		double area_Do_Triangulo_X = Equação1(soma_Dos_Lados_Do_Triangulo_X, ladoA, ladoB, ladoC);
		System.out.println("A Área do Triângulo X é: " + area_Do_Triangulo_X);
		System.out.println("===================================================================== \n");
		System.out.println("Triângulo Y");

		System.out.print("Digite o Lado A do Triângulo y: ");
		double ladoA2 = dados.nextDouble();

		System.out.print("Digite o Lado B do Triângulo y: ");
		double ladoB2 = dados.nextDouble();

		System.out.print("Digite o Lado C do Triângulo y: ");
		double ladoC2 = dados.nextDouble();

		double soma_Dos_Lados_Do_Triangulo_Y = ladoA2 + ladoB2 + ladoC2;
		double area_Do_Triangulo_Y = Equação1(soma_Dos_Lados_Do_Triangulo_Y, ladoA2, ladoB2, ladoC2);
		System.out.println("A Área do Triângulo Y é: " + area_Do_Triangulo_Y + "\n");
		System.out.println("===================================================================== \n");
		double maior_ou_menor = Maior_Menor(area_Do_Triangulo_X, area_Do_Triangulo_Y );
} catch(java.util.InputMismatchException exception){
	System.out.println("Informe um valor válido.");
}
	}

	public static double Equação1 (double p, double a, double b, double c) {
		if(p != 0) {
			p = p / 2;}
		double equacao_Da_Area_Antes_Da_Raiz = p * (p - a) * (p - b) * (p - c);
		double raiz = Math.sqrt(equacao_Da_Area_Antes_Da_Raiz);
		return raiz;
	}

	public static double Maior_Menor (double triangulo_X, double triangulo_y) {
		if(triangulo_X > triangulo_y) {
			System.out.println("O Triângulo com Maior Área é: Triângulo X");		
		}
		if(triangulo_X < triangulo_y) {
			System.out.println("O Triângulo com Maior Área é: Triângulo Y");	
		}
		if(triangulo_X == triangulo_y) {
			System.out.println("Ambos os Triângulos São Idênticos.");
		}
		return triangulo_y;
	}
}