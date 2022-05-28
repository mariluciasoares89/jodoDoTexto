package jogoDoTexto;

import java.util.Scanner;

public class Jogo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("    Você está em uma casa no meio da floresta....");
		System.out.println(" Escolha uma direção (w, d, s, a ):");
		
		String op;

		do {
			op = new Scanner(System.in).nextLine();
			
			if(op.equals("w")){
			System.out.println("Parede! vc bateu a cabeça e morreu!");
			
			}else if(op.equals("d")){
				System.out.println("Lobos selvagem! Você foi devorado!");
				
			}else if(op.equals("s")){
				System.out.println("Cuidado , monstro! você foi esmagado!");
				
			}else if (op.equals("a")) {
				System.out.println("Você encontrou a saída! Parabéns!");
			}
			
		}while(!op.equals("a"));//enquanto op não for igual a "a"
		
		
		
		
	}

}
