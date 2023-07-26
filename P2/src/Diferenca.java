import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		/* Leia quatro valores inteiros A, B, C e D. 
		 * A seguir, calcule e mostre a diferença do 
		 * produto de A e B pelo produto de C e D 
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		       
	       Scanner input = new Scanner(System.in);
	       
	       int A = input.nextInt();
	       int B = input.nextInt();
	       int C = input.nextInt();
	       int D = input.nextInt();
	       
	       int diferenca = A * B - C * D;
	       
	       System.out.println("DIFERENCA = " + (diferenca));

	}

}
