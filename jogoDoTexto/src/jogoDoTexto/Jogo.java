package jogoDoTexto;

import java.util.Scanner;

public class Jogo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("    Voc� est� em uma casa no meio da floresta....");
		System.out.println(" Escolha uma dire��o (w, d, s, a ):");
		
		String op;

		do {
			op = new Scanner(System.in).nextLine();
			
			if(op.equals("w")){
			System.out.println("Parede! vc bateu a cabe�a e morreu!");
			
			}else if(op.equals("d")){
				System.out.println("Lobos selvagem! Voc� foi devorado!");
				
			}else if(op.equals("s")){
				System.out.println("Cuidado , monstro! voc� foi esmagado!");
				
			}else if (op.equals("a")) {
				System.out.println("Voc� encontrou a sa�da! Parab�ns!");
			}
			
		}while(!op.equals("a"));//enquanto op n�o for igual a "a"
		
		
		
		
	}

}
